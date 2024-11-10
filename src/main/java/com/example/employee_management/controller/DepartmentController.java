package com.example.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee_management.entity.Department;
import com.example.employee_management.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    // Get all departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    // Get department by ID
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    // Create a new department
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.saveOrUpdateDepartment(department);
    }

    // Update an existing department
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        department.setId(id);
        return departmentService.saveOrUpdateDepartment(department);
    }

    // Delete a department
    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
}

