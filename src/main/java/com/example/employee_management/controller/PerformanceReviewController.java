package com.example.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee_management.entity.PerformanceReview;
import com.example.employee_management.service.PerformanceReviewService;

import java.util.List;

@RestController
@RequestMapping("/performance-reviews")
public class PerformanceReviewController {
    @Autowired
    private PerformanceReviewService performanceReviewService;

    // Get all performance reviews
    @GetMapping
    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewService.getAllPerformanceReviews();
    }

    // Get performance review by ID
    @GetMapping("/{id}")
    public PerformanceReview getPerformanceReviewById(@PathVariable Long id) {
        return performanceReviewService.getPerformanceReviewById(id);
    }

    // Create a new performance review
    @PostMapping
    public PerformanceReview createPerformanceReview(@RequestBody PerformanceReview performanceReview) {
        return performanceReviewService.saveOrUpdatePerformanceReview(performanceReview);
    }

    // Update an existing performance review
    @PutMapping("/{id}")
    public PerformanceReview updatePerformanceReview(@PathVariable Long id, @RequestBody PerformanceReview performanceReview) {
        performanceReview.setId(id);
        return performanceReviewService.saveOrUpdatePerformanceReview(performanceReview);
    }

    // Delete a performance review
    @DeleteMapping("/{id}")
    public void deletePerformanceReview(@PathVariable Long id) {
        performanceReviewService.deletePerformanceReview(id);
    }
}

