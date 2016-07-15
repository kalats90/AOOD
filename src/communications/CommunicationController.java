package communications;

import java.util.ArrayList;

public class CommunicationController implements CommunicationControllerInterface{
	
	private ArrayList<Message> incomingMessages = new ArrayList<Message>();
	private LFRadio longWaweRadio = new LFRadio();
	private SFRadio shortWaweRadio = new SFRadio();
	private GPS gps = new GPS();
	
	public CommunicationController() {
        
    }
	
	public void sendMessage(Message message, String peer){
		
	}
	
	public Location getLocation(){
		return gps.getLocation();
	}
	
	public void sendMessage(Message message){
		longWaweRadio.sendMessage(message);
		shortWaweRadio.sendMessage(message);
	}
	
	public void recieveMessage(){
		if(longWaweRadio.hasMessage()){
			incomingMessages.add(longWaweRadio.recieveMessage());
		}
		if(shortWaweRadio.hasMessage()){
			incomingMessages.add(longWaweRadio.recieveMessage());
		}
	}
	
	public Message getMessage(){
		if(incomingMessages.size()>0)
			return incomingMessages.remove(0);
		else
			return null;
	}
}
