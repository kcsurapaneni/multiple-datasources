package com.learn.md.controller.customer;

import com.learn.md.dto.customer.*;
import com.learn.md.service.customer.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Krishna Chaitanya
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return new ResponseEntity<>(customerService.fetchAllCustomers(), HttpStatus.OK);
    }

}
