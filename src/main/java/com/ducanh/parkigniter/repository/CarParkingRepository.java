package com.ducanh.parkigniter.repository;


import com.ducanh.parkigniter.entity.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarParkingRepository extends JpaRepository<Parking,Integer> {
    List<Parking> findByParkingCodeContaining(String keyword);
}
