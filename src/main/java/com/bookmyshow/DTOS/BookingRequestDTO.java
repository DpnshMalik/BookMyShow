package com.bookmyshow.DTOS;

import java.util.List;

import com.bookmyshow.models.Show;
import com.bookmyshow.models.User;

import lombok.Data;

@Data
public class BookingRequestDTO {
	private List<Long> seatIds;
	private Long userId;
	private Long showId;
	
	
	
	

}
