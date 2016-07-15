package factory;

import communications.CommunicationController;
import communications.CommunicationControllerInterface;
import hardware.HardwareController;
import sensors.PassiveSonobuoySensorConntroller;
import sensors.SensorController;
import states.StateController;

public class PassiveSonobuoyFactory implements SonobuoyFactory {
	public PassiveSonobuoyFactory() {
    }
	
	public HardwareController createHardwareController(){
		return new HardwareController();
	}
	public SensorController createSensorController(){
		return new PassiveSonobuoySensorConntroller();
	}
	public CommunicationControllerInterface createCommunicationController(){
		return new CommunicationController();
	}
	public StateController createStateController(){
		return new StateController();
	}
}
