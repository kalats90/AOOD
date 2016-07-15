package hardware;

public interface HardwareControllerInterface {
	
	void unfoldFrames();
	void foldFrames();

	boolean isFrameOpen();
	int getCurrentTime();

    void openShot();
}
