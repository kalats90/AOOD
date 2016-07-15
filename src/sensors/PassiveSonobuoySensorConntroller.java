package sensors;

public class PassiveSonobuoySensorConntroller implements SensorController{

	private final AltitudeSensor altitudeSensor;
	private final DepthSensor depthSensor;
	private final Sonar sonar;
	private final WaterSensor waterDetector;
	private final WaterTemperatureSensor temperatureSensor;
	
	
	public PassiveSonobuoySensorConntroller() {
		altitudeSensor = new AltitudeSensor();
		depthSensor = new DepthSensor();
		sonar = new Sonar(2);
		waterDetector = new WaterSensor();
		temperatureSensor = new WaterTemperatureSensor();
	}
	
	public double getDepth(){
		return depthSensor.getSensorReading();
	}
	
	
	public Telemetry getSonarTelemetry(){
		return sonar.getSensorReading();
	}
	

	public double getAltitude(){
		return altitudeSensor.getSensorReading();
	}
	
	   
	public boolean waterCheck(){
		return waterDetector.getSensorReading();
	}
	
	
	public double getWaterTemperature(){
		return temperatureSensor.getSensorReading();
	}
	
	public double getWaterCurrent(){
		return -1;
	}
	
	public double getSeismicActivity(){
		return -1;
	}
	
	public double getGeothermalActivity(){
		return -1;
	}
	
}
