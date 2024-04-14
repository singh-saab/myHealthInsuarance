package com.healthCare.policyService.entities;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Customer {
    private Long id;
    private String customername;
    private Long policyId;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String role;
    private String contactNumber;
}
