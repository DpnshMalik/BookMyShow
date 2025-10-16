package com.bookmyshow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.models.Show;
import com.bookmyshow.models.ShowSeat;
import com.bookmyshow.models.ShowSeatType;
import com.bookmyshow.repository.ShowSeatTypeRepository;

@Service
public class PriceCalculatorService {

    @Autowired
    private ShowSeatTypeRepository showSeatTypeRepository;

    public int calculatePrice(List<ShowSeat> showSeatList, Show show){

        //1. Get all showSeatType for that show
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShow(show);

        //2. Get seatType of the showSeats
        //3. Add amount for all seats
        int amount = 0;

        for(ShowSeat showSeat : showSeatList){
            for(ShowSeatType showSeatType : showSeatTypes){
                if(showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())){
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }
        return amount;

    }
}
