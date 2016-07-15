package sensors;

public interface SensorController {
	
	public Telemetry getSonarTelemetry();
	
	
	public double getDepth();
	
	
	public double getAltitude();
	
	   
	public boolean waterCheck();
	
	
	public double getWaterTemperature();
	
	
	public double getWaterCurrent();
	
	
	public double getSeismicActivity();
	
	
	public double getGeothermalActivity();

}
