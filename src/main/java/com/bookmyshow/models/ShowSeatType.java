package com.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ShowSeatType extends BaseModel {

	private int price;
	
    @ManyToOne
	private Show show;
    
    @ManyToOne
	private SeatType seatType;
	
}
