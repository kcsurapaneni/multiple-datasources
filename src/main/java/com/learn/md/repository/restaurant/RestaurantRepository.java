package com.learn.md.repository.restaurant;

import com.learn.md.model.restaurant.*;
import org.springframework.data.jpa.repository.*;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}