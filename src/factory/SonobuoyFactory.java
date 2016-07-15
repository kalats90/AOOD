package factory;

import communications.CommunicationControllerInterface;
import hardware.HardwareController;
import sensors.SensorController;
import states.StateController;

public interface SonobuoyFactory {
   public HardwareController createHardwareController();
   public SensorController createSensorController();
   public CommunicationControllerInterface createCommunicationController();
   public StateController createStateController();
}
