package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private long id;
    private String first_name;
    private String last_name;
    private String email_address;
}
