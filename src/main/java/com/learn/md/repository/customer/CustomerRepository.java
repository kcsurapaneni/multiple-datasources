package com.learn.md.repository.customer;

import com.learn.md.model.customer.*;
import org.springframework.data.jpa.repository.*;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}