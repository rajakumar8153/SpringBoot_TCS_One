package com.tcs.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/employees")
public class Controller {
      @GetMapping
    public String getEmployees() {
        return "Employee list retrieved successfully!";
    }

    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable int id) {
        return "Employee ID: " + id;
    }

    @PostMapping
    public String addEmployee(@RequestBody String employee) {
        return "Employee added successfully: " + employee;
    }
}
