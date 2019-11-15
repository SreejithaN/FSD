package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.CustomerOrders;
@Repository
public interface CustomerOrdersRepository extends JpaRepository<CustomerOrders, Integer> {

}
