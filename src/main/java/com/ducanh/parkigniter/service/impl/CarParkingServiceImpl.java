package com.ducanh.parkigniter.service.impl;
import com.ducanh.parkigniter.entity.Parking;
import com.ducanh.parkigniter.repository.CarParkingRepository;
import com.ducanh.parkigniter.service.CarParkingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarParkingServiceImpl implements CarParkingService {
    private final CarParkingRepository carParkingRepository;

    @Override
    public List<Parking> searchAll(String keyword) {
        if(keyword == null){
            return carParkingRepository.findAll();
        }
        return carParkingRepository.findByParkingCodeContaining(keyword);
    }


    }

