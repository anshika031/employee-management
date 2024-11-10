package com.example.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_management.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
