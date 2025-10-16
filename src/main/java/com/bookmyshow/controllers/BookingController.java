package com.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.DTOS.BookingRequestDTO;
import com.bookmyshow.DTOS.BookingResponseDTO;
import com.bookmyshow.enums.ResponseStatus;
import com.bookmyshow.models.Booking;
import com.bookmyshow.services.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/make")
    public ResponseEntity<BookingResponseDTO> makeBooking(@RequestBody BookingRequestDTO bookingRequestDTO) {
        BookingResponseDTO bookingResponseDTO = new BookingResponseDTO();
        try {
            Booking booking = bookingService.getBookingDetails(
                    bookingRequestDTO.getSeatIds(),
                    bookingRequestDTO.getUserId(),
                    bookingRequestDTO.getShowId()
            );

            bookingResponseDTO.setBookingId(booking.getId());
            bookingResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);

            return ResponseEntity.status(HttpStatus.CREATED).body(bookingResponseDTO);
        } catch (Exception e) {
            bookingResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bookingResponseDTO);
        }
    }
}
