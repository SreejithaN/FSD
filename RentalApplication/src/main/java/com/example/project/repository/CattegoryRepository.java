package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Address;
import com.example.project.entity.Cattegory;
@Repository
public interface CattegoryRepository extends JpaRepository<Cattegory, Integer>{

}
