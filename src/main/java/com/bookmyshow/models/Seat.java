package com.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat extends BaseModel {

	private String seatNumber;
	private int rowValue;
	private int colValue;
	
	@ManyToOne
	private SeatType seatType;
	
}
