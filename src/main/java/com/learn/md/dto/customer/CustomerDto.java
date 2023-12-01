package com.learn.md.dto.customer;

import com.fasterxml.jackson.annotation.*;
import com.learn.md.model.customer.*;
import lombok.*;
import lombok.experimental.*;

import java.io.*;

/**
 * DTO for {@link com.learn.md.model.customer.Customer}
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDto implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public static CustomerDto from(Customer customer) {
        return CustomerDto
                .builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .build();
    }

}