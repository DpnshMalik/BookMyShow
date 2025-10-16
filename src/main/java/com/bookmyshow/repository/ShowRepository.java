package com.bookmyshow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.models.Show;
import com.bookmyshow.models.User;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{

    @Override
    Optional<Show> findById(Long aLong);
}
