package com.ganesh.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "emp_id", strategy = "com.ganesh.idhelper")
	@GeneratedValue(generator = "emp_id")
	@Column(name = "emp_id")
	private String empId;
	private String name;
	private String dept;
	private double salary;

}
