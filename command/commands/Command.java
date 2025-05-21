package command.commands;

import command.interfaces.Vehicle;

public abstract class Command {
    protected Vehicle vehicle;

    public Command(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void execute();
}
/*Sería una buena implementación crear una clase padre que indique que cada
comando debe tener un vehículo que ejecuta acciones.
 */