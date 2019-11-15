package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Products;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
