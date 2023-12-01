package com.learn.md.service.restaurant;

import com.learn.md.dto.restaurant.*;
import com.learn.md.repository.restaurant.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.stream.*;

/**
 * @author Krishna Chaitanya
 */
@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public List<RestaurantDto> fetchAllRestaurants() {
        return restaurantRepository.findAll().stream().map(RestaurantDto::from).collect(Collectors.toList());
    }

}
