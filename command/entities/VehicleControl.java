package command.entities;

import command.commands.Command;

public class VehicleControl {
    private final Command start;
    private final Command accelerate;
    private final Command doBrake;

    public VehicleControl(Command start, Command accelerate, Command doBrake) {
        this.start = start;
        this.accelerate = accelerate;
        this.doBrake = doBrake;
    }

    public void turnOnTheMachine() {
        start.execute();
    }

    public void pressAccelerator() {
        accelerate.execute();
    }

    public void pressBrake() {
        doBrake.execute();
    }
}
