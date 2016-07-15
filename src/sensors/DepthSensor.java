package sensors;

public class DepthSensor {
	private double depth = 0;
	
	public double getSensorReading() {
		depth++;
		return this.depth;
	}
}

