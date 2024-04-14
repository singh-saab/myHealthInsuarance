package com.healthCare.customerService.entities;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Policy {
    private Long policyId;
    private String policyNumber;
    private Long customerId;
    private String policyName;
    private String policyType;
    private int coverageAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String premiumAmount;
}
