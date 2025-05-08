package command.entities;

import command.interfaces.Vehicle;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Coche: Acelerando...");
    }
    @Override
    public void start() {
        System.out.println("Coche: Motor encendido");
    }
    @Override
    public void doBrake() {
        System.out.println("Coche: Frenando");
    }
}