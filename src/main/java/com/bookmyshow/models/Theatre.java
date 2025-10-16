package com.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Theatre extends BaseModel {

	
	private String name;
	
	@OneToMany
	private List<Screen> screens;
	
	@ManyToOne
	private Region region;
	
	
}
