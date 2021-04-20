package ru.geekbrains;

public class RoadForCarAdapter implements Road {
    private RoadForCar road;

    public RoadForCarAdapter() {
        road = new RoadForCar();
    }

    public void ride() {
        road.ride();
    }
}
