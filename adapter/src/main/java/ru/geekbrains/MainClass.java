package ru.geekbrains;

public class MainClass {
    public static void main(String[] args){
        Cyclist cyclist = new Cyclist(new RoadForCarAdapter());
        cyclist.rideOnTheRoad();
    }
}
