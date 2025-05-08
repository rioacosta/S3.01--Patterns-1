package command;

import command.controlers.VehicleControl;
import command.entities.Bicycle;
import command.entities.Boat;
import command.entities.Car;
import command.entities.Plane;
import command.interfaces.Vehicle;

public class Main {
    public static void main (String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();

        VehicleControl carControl = new VehicleControl(car);
        VehicleControl bicycleControl = new VehicleControl(bicycle);
        VehicleControl planeControl = new VehicleControl(plane);
        VehicleControl boatControl = new VehicleControl(boat);

        System.out.println("--------------------------");
        carControl.turnOnTheMachine();
        carControl.pressAccelerator();
        carControl.pressBrake();

        System.out.println("--------------------------");
        planeControl.turnOnTheMachine();
        planeControl.pressAccelerator();
        planeControl.pressBrake();

        System.out.println("--------------------------");
        bicycleControl.pressBrake();
        bicycleControl.turnOnTheMachine();
        bicycleControl.pressAccelerator();

        System.out.println("--------------------------");
        boatControl.turnOnTheMachine();
        boatControl.pressAccelerator();
        boatControl.pressBrake();
        System.out.println("--------------------------");
    }
}