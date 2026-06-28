package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;
    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
    public int getBatterySize() {
        return batterySize;
    }
    public ElectricCar(String name, String description, int batterySize, double avgKmPerCharge) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    public String startEngine(){
        return "Electric engine starting.";
    }
    protected String runEngine() {
        return "Electric engine running.";
    }
}
