package command.entities;

import command.interfaces.Vehicle;

public class Plane implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Avión: Aumentando potencia");
    }

    @Override
    public void start() {
        System.out.println("Avión: Motor encendido");
    }

    @Override
    public void doBrake() {
        System.out.println("Avión: Reduciendo velocidad");
    }
}
