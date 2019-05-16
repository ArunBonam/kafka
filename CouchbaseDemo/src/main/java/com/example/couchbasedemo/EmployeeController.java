package com.example.couchbasedemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @PostMapping("/Employee/add")
    public Employee addEmployee(@RequestBody Employee emp)
    {
        return repository.save(emp);
    }

    @GetMapping("/employee/{id}")

    public Optional<Employee> getEmployee(@PathVariable Integer id)
    {
        System.out.println("gjbjbkn");
        return repository.findById(id);

    }




}


