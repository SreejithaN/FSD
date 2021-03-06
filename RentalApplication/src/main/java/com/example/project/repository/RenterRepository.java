package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Renter;
@Repository
public interface RenterRepository extends JpaRepository<Renter, Integer> {

}
