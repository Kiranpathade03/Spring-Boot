package com.bean.Employee1.EmployeeController;

import com.bean.Employee1.EmployeeDto.EmployeeDTO;
import com.bean.Employee1.EmployeeService.EmployeeService;
import com.bean.Employee1.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{empid}")
    public Employee getEmployee(@PathVariable long empid){
      return employeeService.getEmployee(empid);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.addEmployee(employeeDTO) ;
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployees(id);
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody EmployeeDTO employeeDTO,@PathVariable long id){
        return employeeService.updateEmployee(employeeDTO,id);
    }

    @PatchMapping("/employee/{id}")
    public Employee partialUpdate(@RequestBody Map<String,Object> fields, @PathVariable long id){
        return employeeService.partialUpdate(fields,id);
    }
}
