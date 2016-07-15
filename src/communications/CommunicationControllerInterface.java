package communications;

public interface CommunicationControllerInterface {
	void sendMessage(Message message);
	Message getMessage();
	Location getLocation();
}
