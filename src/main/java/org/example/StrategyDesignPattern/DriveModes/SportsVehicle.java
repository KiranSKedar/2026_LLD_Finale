package org.example.StrategyDesignPattern.DriveModes;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
