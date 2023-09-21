package com.Strategy;

import com.Strategy.Strategies.SportsVehicle;

public class NormalVehicle extends drrive{
    NormalVehicle() { super(new com.Strategy.Strategies.NormalVehicle());}
}
