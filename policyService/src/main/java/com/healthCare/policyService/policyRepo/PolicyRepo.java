package com.healthCare.policyService.policyRepo;

import com.healthCare.policyService.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicyRepo extends JpaRepository<Policy,Long> {
    List<Policy> findByCustomerId(Long customerId);

    Policy findByPolicyName(String policyName);

    List<Policy> findByPolicyType(String policyType);
}
