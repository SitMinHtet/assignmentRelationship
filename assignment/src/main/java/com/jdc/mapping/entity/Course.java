package com.jdc.mapping.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;


@Entity
@Data
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true,nullable = false)
	private String name;
	private Level level;
	private int fees;
	private double duration;
	@Lob
	private String description;
	
	public enum Level{
		Basic, Intermediate, Advance
	}
	
}
