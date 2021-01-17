package com.nh.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table

public class CityEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cpin;
	@Column
	private String cname;
	@Column
	private String  state;
	@Column
	@CreationTimestamp
	private Date createDate;
	@Column
	@UpdateTimestamp
	private Date updateDate;
	
	
	
	

}
