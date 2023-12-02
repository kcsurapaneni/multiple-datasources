package com.learn.md.repository.review;

import com.learn.md.model.review.*;
import org.springframework.data.mongodb.repository.*;

/**
 * @author Krishna Chaitanya
 */
public interface ReviewRepository extends MongoRepository<Review, Long> {
}
