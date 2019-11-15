package com.example.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cattegory")
@Data
public class Cattegory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cattegory_id")
	private int cattegory_id;
	@Column(name="cattegory_type")
	private String cattegory_type;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cattegory", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<Products> products;
}
