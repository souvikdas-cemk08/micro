package com.example.springframework.msscbrewery.web.service;

import com.example.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .customerName("Souvik Das")
                .build();
    }
}
