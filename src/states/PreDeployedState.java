package states;

import communications.CommunicationControllerInterface;
import hardware.HardwareControllerInterface;
import main.MissionSettings;
import sensors.SensorController;

//Sonobuoy falling down on chute, waiting for contact with water
public class PreDeployedState implements State {
	StateController stateController;

	PreDeployedState(StateController sc) {
        this.stateController = sc;
    }

    public void execute(MissionSettings settings, SensorController sensorController, HardwareControllerInterface hardwareController, CommunicationControllerInterface communicationController) {
    	printState();
    	if(sensorController.waterCheck()&&sensorController.getDepth()>=25){
    		hardwareController.unfoldFrames();
    		stateController.nextState();
    	}
    }
    

    public void printState()
    {
        System.out.println("Pre Deploy State");
    }
}
