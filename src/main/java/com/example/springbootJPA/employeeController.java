package com.example.springbootJPA;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class employeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{eid}")
    public Employee getEmployee(@PathVariable int eid){
        return employeeService.getEmployee(eid);
    }

    @PostMapping("/employees")
    public  void addEmployee(@RequestBody Employee employee){
         employeeService.addEmployee(employee);
    }
    @PutMapping("/employees/{eid}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int eid){
        employeeService.updateEmployee(eid, employee);
    }
    @DeleteMapping("/employees/{eid}")
    public void deleteEmployee(@PathVariable int eid){
        employeeService.deleteEmployee(eid);
    }




}
