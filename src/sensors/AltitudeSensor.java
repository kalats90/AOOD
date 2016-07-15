package sensors;

public class AltitudeSensor {
	private double altitude = 100000;
	
	public double getSensorReading() {
		altitude--;
		return altitude;
	}

}