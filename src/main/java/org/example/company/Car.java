package org.example.company;

public class Car {
    private String name;
    private boolean engine = true;
    private int cylinders;
    private int wheels =4;
    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }
    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
    }
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
    @Override
    public boolean equals(Object car) {
        if(!(car instanceof Car)) {
            return false;
        }
        return name.equals(((Car)car).name) && cylinders == ((Car)car).cylinders;
    }
   @Override
    public String toString() {
       return getClass().getSimpleName() + " " + startEngine() + " " + accelerate() + " " + brake();
    }
}
