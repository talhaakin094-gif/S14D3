package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;
    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }
    public int getCylinders() {
        return cylinders;
    }
    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    public String startEngine(){
        return "Gas power engine starting.";
    }
    protected String runEngine() {
        return "Gas power engine running.";
    }
}
