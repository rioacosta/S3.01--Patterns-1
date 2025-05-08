package command.entities;

import command.interfaces.Vehicle;

public class Boat implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Barco: Aumentando velocidad de las hélices");
    }
    @Override
    public void start() {
        System.out.println("Barco: Motor encendido");
    }
    @Override
    public void doBrake() {
        System.out.println("Barco: Hélices en contramarcha");
    }
}
