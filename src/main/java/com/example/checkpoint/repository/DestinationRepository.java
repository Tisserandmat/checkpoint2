package com.example.checkpoint.repository;

import com.example.checkpoint.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface DestinationRepository extends JpaRepository<Destination, Long> {
}
