package factory;

import communications.CommunicationController;
import communications.CommunicationControllerInterface;
import hardware.HardwareController;
import sensors.SpecialSonobuoySensorConntroller;
import sensors.SensorController;
import states.StateController;

public class SpecialSonobuoyFactory implements SonobuoyFactory{
	public SpecialSonobuoyFactory() {
    }
	
	public HardwareController createHardwareController(){
		return new HardwareController();
	}
	public SensorController createSensorController(){
		return new SpecialSonobuoySensorConntroller();
	}
	public CommunicationControllerInterface createCommunicationController(){
		return new CommunicationController();
	}
	public StateController createStateController(){
		return new StateController();
	}
}
