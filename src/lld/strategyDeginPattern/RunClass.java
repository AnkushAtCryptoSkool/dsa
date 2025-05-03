package src.lld.strategyDeginPattern;

import src.lld.strategyDeginPattern.vehicle.Baleno;
import src.lld.strategyDeginPattern.vehicle.SportsVehicle;
import src.lld.strategyDeginPattern.vehicle.Vehicle;

public class RunClass {
    public static void main(String[] args) {
        Vehicle v1 = new SportsVehicle();
        v1.drive();
        Vehicle v2 = new Baleno();
        v2.drive();
    }
}
