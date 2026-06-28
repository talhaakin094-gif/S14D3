package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public CarSkeleton() {

    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return "just start engine";
    }
    protected String runEngine() {
        return "just run engine";
    }
    public String drive() {
        return runEngine() + " and drive.";
    }
}

