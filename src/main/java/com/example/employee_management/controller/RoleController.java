package com.example.employee_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employee_management.entity.Role;
import com.example.employee_management.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    // Get all roles
    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    // Get role by ID
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    // Create a new role
    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.saveOrUpdateRole(role);
    }

    // Update an existing role
    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role role) {
        role.setId(id);
        return roleService.saveOrUpdateRole(role);
    }

    // Delete a role
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }
}

