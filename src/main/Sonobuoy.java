package main;

import communications.CommunicationControllerInterface;
import hardware.HardwareControllerInterface;
import factory.SonobuoyFactory;
import sensors.SensorController;
import states.StateController;

public class Sonobuoy {
	private MissionSettings settings;
    HardwareControllerInterface hardwareController;
    SensorController sensorController;
    CommunicationControllerInterface communicationController;
    StateController stateController;

    
    public Sonobuoy(SonobuoyFactory factory) {
    	settings = new MissionSettings();
        hardwareController = factory.createHardwareController();
        sensorController = factory.createSensorController();
        communicationController = factory.createCommunicationController();
        stateController = factory.createStateController();
    }
    
    
    void run() {
        //System.out.println(this.getName() + " has started");
        while (true) {
            stateController.getCurrentState().execute(settings, sensorController, hardwareController, communicationController);
        }
    }
}
