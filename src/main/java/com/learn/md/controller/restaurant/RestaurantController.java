package com.learn.md.controller.restaurant;

import com.learn.md.dto.restaurant.*;
import com.learn.md.service.restaurant.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Krishna Chaitanya
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<RestaurantDto>> getAllRestaurants() {
        return new ResponseEntity<>(restaurantService.fetchAllRestaurants(), HttpStatus.OK);
    }

}
