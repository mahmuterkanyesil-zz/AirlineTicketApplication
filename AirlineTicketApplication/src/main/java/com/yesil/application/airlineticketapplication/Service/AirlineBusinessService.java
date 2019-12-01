package com.yesil.application.airlineticketapplication.Service;

import com.yesil.application.airlineticketapplication.Model.AirlineBusiness;
import com.yesil.application.airlineticketapplication.Repository.AirlineBusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlineBusinessService {
    @Autowired
    AirlineBusinessRepository airlineBusinessRepository;

    public AirlineBusiness save(AirlineBusiness airlineBusiness)
    {
        return airlineBusinessRepository.save(airlineBusiness);
    }

    public Optional <AirlineBusiness> findById(long id){
        return airlineBusinessRepository.findById(id);
    }
    public List<AirlineBusiness> findByAll()
    {
        return airlineBusinessRepository.findAll();
    }
}
