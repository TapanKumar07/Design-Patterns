package com.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<drrive> myList = new ArrayList<>();
        myList.add(new SportsVehicle());
        myList.add(new NormalVehicle());
        myList.add(new OffRoadVehicle());

        for(drrive d : myList) {
            d.Drive();
        }

    }
}
