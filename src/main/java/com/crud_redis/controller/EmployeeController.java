package com.crud_redis.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud_redis.model.Employee;
import com.crud_redis.repository.EmployeeRepository;

public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employeeRepository.saveEmployee(employee);
        return employee;
    }

    @GetMapping("/employees")
    public Set<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable("id") Integer id) {

        return employeeRepository.findById(id);
    }

    @PutMapping("/employee}")
    public void update(@RequestBody Employee employee) {

        employeeRepository.update(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable("id") Integer id) {
        employeeRepository.delete(id);
    }

}