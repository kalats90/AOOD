package states;

import communications.CommunicationControllerInterface;
import hardware.HardwareControllerInterface;
import main.MissionSettings;
import sensors.SensorController;

//Sonobuoy is in the water, waiting to fully unfold and for right depth
public class DeployingState implements State {

    StateController stateController;

    DeployingState(StateController sc) {
        this.stateController = sc;
    }

    public void execute(MissionSettings settings, SensorController sensorController, HardwareControllerInterface hardwareController, CommunicationControllerInterface communicationController) {
        printState();
        if(hardwareController.isFrameOpen()&&sensorController.getDepth()==50){
    		stateController.nextState();
    	}
    }
    

    public void printState()
    {
        System.out.println("Deploying State");
    }
}
