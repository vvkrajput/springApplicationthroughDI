package com.example.BasicSpringBootProjectUsingDI.repository;

import com.example.BasicSpringBootProjectUsingDI.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeEntity, Integer> {
}
