package com.ducanh.parkigniter.service;

import com.ducanh.parkigniter.entity.Parking;

import java.util.List;

public interface CarParkingService {
    List<Parking> searchAll(String keyword);
}
