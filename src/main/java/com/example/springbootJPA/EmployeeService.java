package com.example.springbootJPA;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees(){
        List<Employee> employeeList= new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }


    public Employee getEmployee(int eid) {
        return employeeRepository.findById(eid).get();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(int eid,Employee employee) {
        employeeRepository.save(employee);

    }

    public void deleteEmployee(int eid) {
        employeeRepository.deleteById(eid);

    }

}
