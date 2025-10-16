package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.models.ShowSeat;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

	@Override
	List<ShowSeat> findAllById(Iterable<Long> longs);

	@Override
	ShowSeat save(ShowSeat showSeat);


}
