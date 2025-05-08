package command.controlers;

import command.entities.*;
import command.specificCommands.AccelerateCommand;
import command.specificCommands.DoBrakeCommand;
import command.specificCommands.StartCommand;
import command.interfaces.Vehicle;

public class DemoApp {

    public static void run() {
            Vehicle car = new Car();
            VehicleControl carControl = new VehicleControl(
                    new StartCommand(car),
                    new AccelerateCommand(car),
                    new DoBrakeCommand(car)

            );
            carControl.turnOnTheMachine();
            carControl.pressAccelerator();
            carControl.pressBrake();
            System.out.println("--------------------------------");

            Vehicle plane = new Plane();
            VehicleControl planeControl = new VehicleControl(
                    new StartCommand(plane),
                    new AccelerateCommand(plane),
                    new DoBrakeCommand(plane));
            planeControl.turnOnTheMachine();
            planeControl.pressAccelerator();
            planeControl.pressBrake();
            System.out.println("--------------------------------");

            Vehicle boat = new Boat();
            VehicleControl boatControl = new VehicleControl(
                    new StartCommand(boat),
                    new AccelerateCommand(boat),
                    new DoBrakeCommand(boat));
            boatControl.turnOnTheMachine();
            boatControl.pressAccelerator();
            boatControl.pressBrake();
            System.out.println("--------------------------------");

            Vehicle bycicle = new Bicycle();
            VehicleControl bycicleControl = new VehicleControl(
                    new StartCommand(bycicle),
                    new AccelerateCommand(bycicle),
                    new DoBrakeCommand(bycicle));
            bycicleControl.turnOnTheMachine();
            bycicleControl.pressAccelerator();
            bycicleControl.pressBrake();
            System.out.println("--------------------------------");

    }
}
