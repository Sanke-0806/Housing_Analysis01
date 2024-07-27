package com.example.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User{
	
	String Name ;
	@Id
	int id ;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
