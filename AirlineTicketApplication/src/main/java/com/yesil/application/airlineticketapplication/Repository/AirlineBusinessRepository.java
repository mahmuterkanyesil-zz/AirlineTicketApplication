package com.yesil.application.airlineticketapplication.Repository;

import com.yesil.application.airlineticketapplication.Model.AirlineBusiness;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AirlineBusinessRepository extends JpaRepository<AirlineBusiness, Long> {
}
