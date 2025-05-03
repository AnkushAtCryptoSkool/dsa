package src.lld.strategyDeginPattern.vehicle;

import src.lld.strategyDeginPattern.driveStrategy.HighSpeedDrive;
import src.lld.strategyDeginPattern.driveStrategy.NormalDrive;

public class Baleno extends Vehicle{
    public Baleno() {
        super(new NormalDrive());
    }

}
