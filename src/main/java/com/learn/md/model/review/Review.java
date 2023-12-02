package com.learn.md.model.review;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.*;

/**
 * @author Krishna Chaitanya
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document("review")
public class Review {

    @Id
    @Field(name = "review_id")
    private Long reviewId;

    @Field(name = "customer_id")
    private Long customerId;

    @Field(name = "menu_item_id")
    private Long menuItemId;

    private Integer rating;

    private String comment;

}
