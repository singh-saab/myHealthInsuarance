package com.healthCare.customerService.clients;

import com.healthCare.customerService.entities.Policy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "policy-service",
        url = "http://localhost:8001/"
)
public interface PolicyProxy {
    @GetMapping({"/policies/customer/{customerId}"})
    List<Policy> getAllPoliciesByCustomerId(@PathVariable Long customerId);
}
