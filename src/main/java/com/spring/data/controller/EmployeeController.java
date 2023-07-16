package com.spring.data.controller;

import com.spring.data.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    List<Employee> list = Arrays.asList(new Employee(1 , "ahmed", 3000),new Employee(2 , "ali", 5000));


    @GetMapping("")
    public List<Employee> getAllEmp(){
         return list;
    }



}
