package com.Strategy;

import com.Strategy.Strategies.drive;

public class SportsVehicle extends drrive{
    SportsVehicle() {
        super(new com.Strategy.Strategies.SportsVehicle());
    }
}
