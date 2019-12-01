package com.yesil.application.airlineticketapplication.Repository;

import com.yesil.application.airlineticketapplication.Model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
}
