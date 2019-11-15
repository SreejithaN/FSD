package com.example.project.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="products_id")
	private int products_id;
	@Column(name="products_name")
	private String products_name;
	@Column(name="products_quantity")
	private int products_quantity;
	@Column(name="products_description")
	private String products_description;
	@Column(name="products_price")
	private double products_price;
	@Column(name="products_features")
	private Blob products_features;
	
	
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@JoinColumn(name="renter_id")
	private Renter renter;
}
