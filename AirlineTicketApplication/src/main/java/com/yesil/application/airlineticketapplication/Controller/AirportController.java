package com.yesil.application.airlineticketapplication.Controller;

import com.yesil.application.airlineticketapplication.Model.Airport;
import com.yesil.application.airlineticketapplication.Service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("airport")

public class AirportController {
    @Autowired
    AirportService airportService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Airport add (@RequestBody @Valid Airport airport)
    {
        return airportService.save(airport);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Airport> findById(@PathVariable long id)
    {
        return airportService.findById(id);
    }

    @RequestMapping(value = "/get-airport", method = RequestMethod.GET)
    public List<Airport> findByAll(){
        return airportService.findByAll();
    }
}
