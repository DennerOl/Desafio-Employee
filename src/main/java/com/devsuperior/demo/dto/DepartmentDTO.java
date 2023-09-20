package com.devsuperior.demo.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.devsuperior.demo.entities.Department;

@SuppressWarnings("serial")
public class DepartmentDTO implements Serializable {

	public Long id;
	public String name;
	
	public DepartmentDTO() {
		
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
		
	public DepartmentDTO(Department entity) {
		
		 BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}	
