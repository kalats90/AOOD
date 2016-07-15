package states;

import java.util.ArrayList;
import java.util.Random;
import communications.CommunicationControllerInterface;
import communications.Message;
import sensors.SensorController;
import hardware.HardwareControllerInterface;
import main.MissionSettings;
import java.util.Iterator;


//Sonobuoy is in operational state
public class DeployedState implements State {

    StateController stateController;
    private ArrayList<String> peers = new ArrayList<String>();
    
    DeployedState(StateController sc) {
        this.stateController = sc;
    }

    public void execute(MissionSettings settings, SensorController sensorController, HardwareControllerInterface hardwareController, CommunicationControllerInterface communicationController) {
        printState();
        for(Iterator<String> i = peers.iterator(); i.hasNext(); ) {
            String peer = i.next();
            System.out.println(peer);
        }
        sensorController.getSonarTelemetry();
        Random rnd = new Random();
        if(rnd.nextBoolean()){
        	communicationController.sendMessage(new Message());
        	System.out.println("Sending Message");
        }
        
        if(settings.getMissionDuration()<hardwareController.getCurrentTime()){
    		stateController.nextState();
    	}
    }
    

    public void printState()
    {
        System.out.println("Deployed State");
    }
}
