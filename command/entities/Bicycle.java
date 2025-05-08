package command.entities;

import command.interfaces.Vehicle;

public class Bicycle implements Vehicle {

    @Override
    public void accelerate() { System.out.println("Bicicleta: Pedal más rápido"); }

    @Override
    public void start() { System.out.println("Bicicleta: Pedaleando"); }

    @Override
    public void doBrake() { System.out.println("Bicicleta: Frenando"); }
}
