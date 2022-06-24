package com.ducanh.parkigniter.controller;

import com.ducanh.parkigniter.entity.Parking;
import com.ducanh.parkigniter.service.CarParkingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("origins= http://localhost:3000")
@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor


public class CarParkingController {
    private final CarParkingService service;
@GetMapping("/parkigniter")
    public ResponseEntity<List<Parking>> searchCarParkingList(@RequestParam(required = false) String keyword){
    List<Parking> listCarParking = service.searchAll(keyword);
    return ResponseEntity.ok(listCarParking);
}


}
