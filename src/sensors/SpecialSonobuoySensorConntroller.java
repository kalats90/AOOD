package sensors;

public class SpecialSonobuoySensorConntroller implements SensorController {
	
	private final AltitudeSensor altitudeSensor;
	private final DepthSensor depthSensor;
	private final CurrentSensor currentSensor;
	private final SeismicSensor seismicSensor;
	private final GeothermalPlumeSensor geoThermalSensor;
	private final Sonar sonar;
	private final WaterSensor waterDetector;
	private final WaterTemperatureSensor temperatureSensor;
	
	
	public SpecialSonobuoySensorConntroller() {
		altitudeSensor = new AltitudeSensor();
		depthSensor = new DepthSensor();
		currentSensor = new CurrentSensor();
		seismicSensor = new SeismicSensor();
		geoThermalSensor = new GeothermalPlumeSensor();
		sonar = new Sonar(3);
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
		return currentSensor.getSensorReading();
	}
	
	public double getSeismicActivity(){
		return seismicSensor.getSensorReading();
	}
	
	public double getGeothermalActivity(){
		return geoThermalSensor.getSensorReading();
	}

}
