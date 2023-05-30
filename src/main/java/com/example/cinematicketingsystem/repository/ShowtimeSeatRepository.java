package com.example.cinematicketingsystem.repository;

import com.example.cinematicketingsystem.entity.ShowtimeSeat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowtimeSeatRepository extends CrudRepository<ShowtimeSeat, Long> {
    Optional<List<ShowtimeSeat>> findByShowtimeIdAndAvailableTrue(Long showtimeId);
}