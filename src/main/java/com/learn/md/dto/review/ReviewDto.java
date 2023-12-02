package com.learn.md.dto.review;

import com.fasterxml.jackson.annotation.*;
import com.learn.md.model.review.*;

import java.io.*;

/**
 * DTO for {@link com.learn.md.model.review.Review}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ReviewDto(Long reviewId, Long customerId, Long menuItemId, Integer rating,
                        String comment) implements Serializable {

    public static ReviewDto from(Review review) {
        return new ReviewDto(
                review.getReviewId(),
                review.getCustomerId(),
                review.getMenuItemId(),
                review.getRating(),
                review.getComment()
        );
    }

}