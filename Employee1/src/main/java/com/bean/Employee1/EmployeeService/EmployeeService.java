package com.bean.Employee1.EmployeeService;

import com.bean.Employee1.EmployeeDto.EmployeeDTO;
import com.bean.Employee1.Entity.Employee;
import com.bean.Employee1.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee e1 = new Employee();
        e1.setName(employeeDTO.getName());
        e1.setCompanyName(employeeDTO.getCompanyName());
        e1.setCity(employeeDTO.getCity());
        e1.setSalary(employeeDTO.getSalary());
        return employeeRepository.save(e1) ;

    }
    public Employee getEmployee(long id){
        return employeeRepository.findById(id).get();
    }
    
    public void deleteEmployees(long id) {
       Employee e=employeeRepository.findById(id).get();
       employeeRepository.delete(e);

        employeeRepository.existsById(id);
    }

    public Employee updateEmployee(EmployeeDTO employeeDTO, long id) {
        Employee e1=employeeRepository.findById(id).get();
        e1.setName(employeeDTO.getName());
        e1.setCity(employeeDTO.getCity());
        e1.setCompanyName(employeeDTO.getCompanyName());
        e1.setSalary(employeeDTO.getSalary());
        return employeeRepository.save(e1);
    }

    public Employee partialUpdate(Map<String,Object>fields, long id) {
        Employee e=employeeRepository.findById(id).get();
        fields.forEach((k,v)->{
            Field field = ReflectionUtils.findField(Employee.class,k);
            field.setAccessible(true);
            ReflectionUtils.setField(field,e,v);
        } );

        return employeeRepository.save(e);


    }
}
