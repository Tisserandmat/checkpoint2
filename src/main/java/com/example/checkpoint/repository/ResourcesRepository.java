package com.example.checkpoint.repository;

import com.example.checkpoint.entity.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourcesRepository extends JpaRepository<Resources, Long> {
}
