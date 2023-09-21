package com.Strategy;

import com.Strategy.Strategies.drive;

public class drrive {

    drive DriverStrategy;
    drrive(drive Driverr) {
        this.DriverStrategy = Driverr;
    }
    void Drive() {
        DriverStrategy.Drive();
    }
}
