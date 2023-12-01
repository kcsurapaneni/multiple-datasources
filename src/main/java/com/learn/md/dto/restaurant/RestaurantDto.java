package com.learn.md.dto.restaurant;

import com.fasterxml.jackson.annotation.*;
import com.learn.md.model.restaurant.*;

import java.io.*;

/**
 * DTO for {@link com.learn.md.model.restaurant.Restaurant}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RestaurantDto(Long id, String name, String address, String phone,
                            String cuisineType) implements Serializable {

    public static RestaurantDto from(Restaurant restaurant) {
        return new RestaurantDto(
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getAddress(),
                restaurant.getPhone(),
                restaurant.getAddress()
        );
    }
}