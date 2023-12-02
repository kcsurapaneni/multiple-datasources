package com.learn.md.service.review;

import com.learn.md.dto.review.*;
import com.learn.md.repository.review.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.stream.*;

/**
 * @author Krishna Chaitanya
 */
@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public List<ReviewDto> fetchAllReviews() {
        return reviewRepository.findAll().stream().map(ReviewDto::from).collect(Collectors.toList());
    }

}
