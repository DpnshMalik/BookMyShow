package com.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookmyshow.DTOS.BookingRequestDTO;
import com.bookmyshow.DTOS.BookingResponseDTO;
import com.bookmyshow.enums.ResponseStatus;
import com.bookmyshow.models.Booking;
import com.bookmyshow.services.BookingService;

public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	public BookingResponseDTO makeBooking(BookingRequestDTO bookingRequestDTO) {
		BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
		try {
			Booking booking = bookingService
									.getBookingDetails(bookingRequestDTO.getSeatIds(),
											bookingRequestDTO.getUserId(),bookingRequestDTO.getShowId());
			bookingResponseDTO.setBookingId(booking.getId());
			bookingResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
		}
		
		catch(Exception e) {
			System.out.println("error in booking tickets");
			bookingResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
		}
		return bookingResponseDTO;
	}
	
}
