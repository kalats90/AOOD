package factory;

import communications.CommunicationControllerInterface;
import communications.CommunicationController;
import hardware.HardwareController;
import sensors.SensorController;
import states.StateController;
import sensors.ActiveSonobuoySensorConntroller;

public class ActiveSonobuoyFactory implements SonobuoyFactory{

	public ActiveSonobuoyFactory() {
    }
	
	public HardwareController createHardwareController(){
		return new HardwareController();
	}
	public SensorController createSensorController(){
		return new ActiveSonobuoySensorConntroller();
	}
	public CommunicationControllerInterface createCommunicationController(){
		return new CommunicationController();
	}
	public StateController createStateController(){
		return new StateController();
	}
}
