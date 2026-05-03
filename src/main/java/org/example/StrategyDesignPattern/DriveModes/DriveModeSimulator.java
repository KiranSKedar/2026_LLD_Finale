package org.example.StrategyDesignPattern.DriveModes;

public class DriveModeSimulator {
    public static void main(String[] args) {
        Vehicle vehicle=new SportsVehicle();
        vehicle.drive();

        vehicle=new OffRoadVehicle();
        vehicle.drive();

        vehicle=new GoodsVehicle();
        vehicle.drive();

        
    }
}
