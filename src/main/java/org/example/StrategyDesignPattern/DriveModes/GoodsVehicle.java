package org.example.StrategyDesignPattern.DriveModes;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
