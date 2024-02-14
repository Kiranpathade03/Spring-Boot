package com.beans.RestApi.Controller;

import com.beans.RestApi.Dto.EmployeeDto;
import com.beans.RestApi.Entity.Employee;
import com.beans.RestApi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee postall( @RequestBody  EmployeeDto employeeDto){
        return  employeeService.PostAll(employeeDto);
    }

//    get mapping code
    @GetMapping("/getemp")
    public List<Employee> getAll(){
        return employeeService.sendAll();
    }


//   delete the record
    @DeleteMapping("/emp/{id}")
    public  void deletebyid(@PathVariable int id){
        employeeService.DeleteOne(id);
    }

}
