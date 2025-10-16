package com.bookmyshow.models;

import java.util.List;

import com.bookmyshow.enums.Feature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Screen extends BaseModel {

	private String name;
	
	@OneToMany
	private List<Seat> seats;
	
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection
	private List<Feature> features;
	
}
