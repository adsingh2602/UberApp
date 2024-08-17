package com.project.uber.uberApp.services;

import java.awt.*;

public interface DistanceService {

    double calculateDistance(Point src, Point dest);


    double calculateDistance(org.locationtech.jts.geom.Point pickupLocation, org.locationtech.jts.geom.Point dropOffLocation);
}