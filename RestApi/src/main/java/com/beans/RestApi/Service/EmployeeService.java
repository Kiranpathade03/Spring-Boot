package com.beans.RestApi.Service;

import com.beans.RestApi.Dto.EmployeeDto;
import com.beans.RestApi.Entity.Employee;
import com.beans.RestApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee PostAll(EmployeeDto employeeDto){
        Employee e1=new Employee();
        e1.setAddress(employeeDto.getAddress());
        e1.setName(employeeDto.getName());
        e1.setSalary(employeeDto.getSalary());
        return employeeRepository.save(e1);

    }


//  get mapping

    public List<Employee> sendAll(){
        return employeeRepository.findAll();


    }

    public void DeleteOne( int id) {

Employee e2=employeeRepository.findById(id).get();
employeeRepository.deleteById(id);

    }

//    delete mapping


}
