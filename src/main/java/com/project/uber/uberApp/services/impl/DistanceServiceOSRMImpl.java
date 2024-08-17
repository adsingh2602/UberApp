package com.project.uber.uberApp.services.impl;

import com.project.uber.uberApp.services.DistanceService;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
//TODO        Call the third party api called OSRM to fetch the distance
        return 0;
    }

    @Override
    public double calculateDistance(org.locationtech.jts.geom.Point pickupLocation, org.locationtech.jts.geom.Point dropOffLocation) {
        return 0;
    }
}