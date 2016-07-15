package sensors;

public class Sonar {
	private String mode;
	
	public Sonar(int mode){
		//Set hardware to required mode
		switch (mode) {
        case 1:  this.mode = "Active";
                 break;
        case 2:  this.mode = "Passive";
                 break;
        case 3:  this.mode = "Special";
                 break;
        default: this.mode = "Invalid Mode";
                 break;
		}

	}
	
	public Telemetry getSensorReading(){
		if(this.mode == "Active"){
			System.out.println("Generating Sound Wawe");
			System.out.println("Listening");
		}else{
			System.out.println("Listening");
		}
		return new Telemetry();
	}
}
