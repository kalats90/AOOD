package states;

import communications.CommunicationControllerInterface;
import sensors.SensorController;
import hardware.HardwareControllerInterface;
import main.MissionSettings;

public interface State {

	public void execute(MissionSettings settings, SensorController sensorController, HardwareControllerInterface hardwareController, CommunicationControllerInterface communicationController);
	public void printState();
}
