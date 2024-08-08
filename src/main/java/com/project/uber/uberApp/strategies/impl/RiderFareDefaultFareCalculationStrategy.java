package com.project.uber.uberApp.strategies.impl;
import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}