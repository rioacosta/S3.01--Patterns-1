package command.controlers;

import command.interfaces.Command;
import command.interfaces.Vehicle;

public class VehicleControl {
    private final Command start;
    private final Command accelerate;
    private final Command doBrake;

    // Constructor recibe el vehículo y asigna comandos automáticamente
    public VehicleControl(Vehicle vehiculo) {
        this.start = vehiculo::start;
        this.accelerate = vehiculo::accelerate;
        this.doBrake = vehiculo::doBrake;
    }

    // Métodos para ejecutar comandos
    public void turnOnTheMachine() {
        start.run();
    }

    public void pressAccelerator() {
        accelerate.run();
    }

    public void pressBrake() {
        doBrake.run();
    }
}
