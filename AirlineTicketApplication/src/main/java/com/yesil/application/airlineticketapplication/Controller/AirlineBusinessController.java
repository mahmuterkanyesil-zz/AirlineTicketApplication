package com.yesil.application.airlineticketapplication.Controller;

import com.yesil.application.airlineticketapplication.Model.AirlineBusiness;
import com.yesil.application.airlineticketapplication.Service.AirlineBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("airline-business")
public class AirlineBusinessController {

    @Autowired
    AirlineBusinessService airlineBusinessService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<AirlineBusiness> getAirlineBusiness(@PathVariable long id)
    {
        return airlineBusinessService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AirlineBusiness save (@RequestBody @Valid AirlineBusiness airlineBusiness)
    {
        return airlineBusinessService.save(airlineBusiness);
    }

    @RequestMapping(value = "/get-airlinebusiness", method = RequestMethod.GET)
    public List<AirlineBusiness> allAirlineBusiness(){
        return airlineBusinessService.findByAll();
    }
}
