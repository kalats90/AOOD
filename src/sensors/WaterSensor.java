package sensors;

public class WaterSensor {
	private int counter;
	public boolean getSensorReading() {
		counter++;
		if (counter > 10000) {
			return true;
		}
		return false;
	}
}
