package com.example.project.entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class CustomerOrders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orders_id")
	private int orders_id;
	@Column(name="orders_datetime")
	private Date orders_datetime;
	@Column(name="orders_cost")
	private double orders_cost;
	@Column(name="orders_quantity")
	private int orders_quantity;
	@Column(name="orders_totalcost")
	private double orders_totalcost;
	
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@JoinColumn(name="renter_id")
	private Renter renter;
	
	@JoinColumn(name="products_id")
	private Products products;
	
}
