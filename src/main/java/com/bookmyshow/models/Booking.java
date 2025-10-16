package com.bookmyshow.models;

import java.util.List;

import com.bookmyshow.enums.BookingStatus;
import com.bookmyshow.enums.Feature;
import com.bookmyshow.enums.ShowStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Date;
import lombok.Data;

@Data
@Entity(name = "bookings")
public class Booking extends BaseModel {
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Show show;
	
	@Enumerated(EnumType.ORDINAL)
	private BookingStatus bookingStatus;
	private Date bookedAt;
	
	@ManyToMany
	private List<ShowSeat> showSeats;
	
	@OneToMany
	private List<Payment> payments;
	
	private int amount;

}
