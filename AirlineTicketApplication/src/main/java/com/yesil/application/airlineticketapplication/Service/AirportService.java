package com.yesil.application.airlineticketapplication.Service;

import com.yesil.application.airlineticketapplication.Model.Airport;
import com.yesil.application.airlineticketapplication.Repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {

    @Autowired
    AirportRepository airportRepository;

    public Airport save(Airport airport)
    {
        return airportRepository.save(airport);
    }

    public Optional<Airport> findById(long id)
    {
        return airportRepository.findById(id);
    }

    public List<Airport> findByAll()
    {
        return airportRepository.findAll();
    }

}
