package states;

import communications.CommunicationControllerInterface;
import hardware.HardwareControllerInterface;
import main.MissionSettings;
import sensors.SensorController;

//Sonobuoy launched from the plane and falling down
public class LaunchedState implements State {
	StateController stateController;

	LaunchedState(StateController sc) {
        this.stateController = sc;
    }

    public void execute(MissionSettings settings, SensorController sensorController, HardwareControllerInterface hardwareController, CommunicationControllerInterface communicationController) {
        //If Altitude <= 1000 Feet open chute
    	printState();
    	if(sensorController.getAltitude()<=1000){
    		hardwareController.openShot();
    		stateController.nextState();
    	}
        
    }
    

    public void printState()
    {
        System.out.println("Launched State");
    }
}
