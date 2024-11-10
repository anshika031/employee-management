package com.example.employee_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_management.entity.PerformanceReview;
import com.example.employee_management.repository.PerformanceReviewRepository;

import java.util.List;

@Service
public class PerformanceReviewService {
    @Autowired
    private PerformanceReviewRepository performanceReviewRepository;

    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewRepository.findAll();
    }

    public PerformanceReview getPerformanceReviewById(Long id) {
        return performanceReviewRepository.findById(id).orElse(null);
    }

    public PerformanceReview saveOrUpdatePerformanceReview(PerformanceReview performanceReview) {
        return performanceReviewRepository.save(performanceReview);
    }

    public void deletePerformanceReview(Long id) {
        performanceReviewRepository.deleteById(id);
    }
}

