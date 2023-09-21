package com.Strategy;

import com.Strategy.Strategies.NormalVehicle;
import com.Strategy.Strategies.SportsVehicle;

public class OffRoadVehicle extends drrive{
    OffRoadVehicle() {super(new SportsVehicle());}
}
