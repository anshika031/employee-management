package com.example.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_management.entity.PerformanceReview;

public interface PerformanceReviewRepository extends JpaRepository<PerformanceReview, Long>{

}
