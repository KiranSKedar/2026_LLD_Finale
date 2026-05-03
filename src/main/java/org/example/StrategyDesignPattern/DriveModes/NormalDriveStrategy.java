package org.example.StrategyDesignPattern.DriveModes;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("I have normal drive strategy");
    }
}
