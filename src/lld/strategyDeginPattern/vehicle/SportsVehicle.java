package src.lld.strategyDeginPattern.vehicle;

import src.lld.strategyDeginPattern.driveStrategy.DriveStrategy;
import src.lld.strategyDeginPattern.driveStrategy.HighSpeedDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new HighSpeedDrive());
    }

}
