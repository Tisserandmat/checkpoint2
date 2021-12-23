package com.example.checkpoint.repository;

import com.example.checkpoint.entity.Steps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepsRepository extends JpaRepository<Steps, Long> {
}
