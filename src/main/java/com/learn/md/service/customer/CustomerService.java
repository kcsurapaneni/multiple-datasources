package com.learn.md.service.customer;

import com.learn.md.dto.customer.*;
import com.learn.md.repository.customer.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.stream.*;

/**
 * @author Krishna Chaitanya
 */
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<CustomerDto> fetchAllCustomers() {
        return customerRepository.findAll().stream().map(CustomerDto::from).collect(Collectors.toList());
    }

}
