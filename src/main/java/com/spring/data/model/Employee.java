package com.spring.data.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Employee {


    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name, int salary) {
          this.id = id;
           this.name = name;
          this.salary = salary;
    }
}
