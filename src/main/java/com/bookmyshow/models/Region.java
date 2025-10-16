package com.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Region extends BaseModel {

	private String name;
	
	private long pinCode;
	
	@OneToMany
	private List<Theatre> theaters;
	
}
