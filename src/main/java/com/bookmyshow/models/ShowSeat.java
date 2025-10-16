package com.bookmyshow.models;
import com.bookmyshow.enums.ShowSeatStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel {

	@ManyToOne
	private Show show;
	
	@ManyToOne
	private Seat seat;
	
	@Enumerated(EnumType.ORDINAL)
	private ShowSeatStatus ShowSeatStatus;

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public ShowSeatStatus getShowSeatStatus() {
		return ShowSeatStatus;
	}

	public void setShowSeatStatus(ShowSeatStatus showSeatStatus) {
		ShowSeatStatus = showSeatStatus;
	}
	
	
	
}
