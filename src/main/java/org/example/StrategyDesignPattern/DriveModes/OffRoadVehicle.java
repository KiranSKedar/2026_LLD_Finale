package org.example.StrategyDesignPattern.DriveModes;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
