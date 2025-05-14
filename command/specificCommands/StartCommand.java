package command.specificCommands;

import command.interfaces.Command;
import command.interfaces.Vehicle;

public class StartCommand implements Command {
    private Vehicle vehicle;
    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.start();
    }
}