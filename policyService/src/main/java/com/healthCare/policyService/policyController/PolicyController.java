package com.healthCare.policyService.policyController;

import com.healthCare.policyService.entities.Policy;
import com.healthCare.policyService.policyRepo.PolicyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolicyController {
    @Autowired
    private PolicyRepo policyRepo;

    public PolicyController() {
    }

    @GetMapping({"/policies"})
    private List<Policy> getAllPolicies() {
        return this.policyRepo.findAll();
    }

    @GetMapping({"/policies/customer/{customerId}"})
    public List<Policy> getAllPoliciesByCustomerId(@PathVariable Long customerId) {
        return this.policyRepo.findByCustomerId(customerId);
    }

    @GetMapping({"/policies/policyName/{policyName}"})
    private Policy getPolicyByPolicyName(@PathVariable String policyName) {
        return this.policyRepo.findByPolicyName(policyName);
    }

    @GetMapping({"/policies/policyType/{policyType}"})
    private List<Policy> getAllPoliciesByPolicyType(@PathVariable String policyType) {
        return this.policyRepo.findByPolicyType(policyType);
    }

    @PostMapping({"/policies"})
    private void addPolicy(@RequestBody Policy policy) {
        this.policyRepo.save(policy);
    }
}
