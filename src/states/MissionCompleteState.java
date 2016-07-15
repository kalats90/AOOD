package states;


import communications.CommunicationControllerInterface;
import hardware.HardwareControllerInterface;
import main.MissionSettings;
import sensors.SensorController;
//Sonobuoy completed and Sonobuoy is sinking
public class MissionCompleteState implements State {
	StateController stateController;

	MissionCompleteState(StateController sc) {
        this.stateController = sc;
    }

    public void execute(MissionSettings settings, SensorController sensorController, HardwareControllerInterface hardwareController, CommunicationControllerInterface communicationController) {
        printState();
        hardwareController.foldFrames();
    }
    

    public void printState()
    {
        System.out.println("Mission Completed State");
        System.out.println("Good Buy ;)");
        System.exit(0);
    }
}
