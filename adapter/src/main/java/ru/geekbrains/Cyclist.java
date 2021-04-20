package ru.geekbrains;

public class Cyclist {
    private Road road;

    public Cyclist(){

    }

    public Cyclist(Road road){
        this.road = road;
    }

    public void rideOnTheRoad() {
        road.ride();
    }
}
