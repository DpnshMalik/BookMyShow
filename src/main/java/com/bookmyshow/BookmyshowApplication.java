package com.bookmyshow;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.bookmyshow.DTOS.BookingRequestDTO;
import com.bookmyshow.DTOS.BookingResponseDTO;
import com.bookmyshow.DTOS.SignUpRequestDTO;
import com.bookmyshow.DTOS.SignUpResponseDTO;
import com.bookmyshow.controllers.BookingController;
import com.bookmyshow.controllers.UserController;

@SpringBootApplication
@EnableJpaAuditing
public class BookmyshowApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(BookmyshowApplication.class);

    @Autowired
    private UserController userController;

    @Autowired
    private BookingController bookingController;

    public static void main(String[] args) {
        SpringApplication.run(BookmyshowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            // ----- Test User Signup -----
            SignUpRequestDTO signUpRequest = SignUpRequestDTO.builder()
                    .email("deepanshuvvdmg@gmail.com")
                    .password("1234")
                    .build();

            SignUpResponseDTO signUpResponse = userController.signUp(signUpRequest);
            logger.info("User Signup Response: {}", signUpResponse);

            // ----- Test Booking -----
            BookingRequestDTO bookingRequest = BookingRequestDTO.builder()
                    .userId(signUpResponse.getUserId()) // use created user ID
                    .showId(101L)
                    .seatIds(Arrays.asList(5L, 6L))
                    .build();

            BookingResponseDTO bookingResponse = bookingController.makeBooking(bookingRequest);
            logger.info("Booking Status: {}", bookingResponse.getResponseStatus());
            logger.info("Booking ID: {}", bookingResponse.getBookingId());

        } catch (Exception e) {
            logger.error("Error during signup or booking", e);
        }
    }
}
