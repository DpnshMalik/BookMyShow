package com.bookmyshow.DTOS;

import com.bookmyshow.enums.ResponseStatus;
import com.bookmyshow.models.Booking;

import lombok.Data;

@Data
public class BookingResponseDTO {
	private int amount;
	private Long bookingId;
	private ResponseStatus responseStatus;

}
