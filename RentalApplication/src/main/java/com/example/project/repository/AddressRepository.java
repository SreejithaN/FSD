package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
