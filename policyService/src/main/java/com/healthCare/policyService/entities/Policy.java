package com.healthCare.policyService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
public class Policy {
    @Id
    @GeneratedValue
    private Long policyId;
    private String policyNumber;
    private Long customerId;
    private String policyName;
    private String policyType;
    private Long coverageAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String premiumAmount;
}
