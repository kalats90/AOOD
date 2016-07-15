package states;

import java.util.ArrayList;


public class StateController {
	
	private int currentState;
	private ArrayList<State> states;
	private final LaunchedState launchedState;
	private final PreDeployedState preDeployedState;
	private final DeployingState deployingState;
	private final DeployedState deployedState;
	private final MissionCompleteState missionCompleteState;
	

	public StateController() {
		launchedState = new LaunchedState(this);
		preDeployedState = new PreDeployedState(this);
		deployingState = new DeployingState(this);
		deployedState = new DeployedState(this);
		missionCompleteState = new MissionCompleteState(this);
		
		currentState = 0;
		
		states = new ArrayList<State>();
		states.add(this.launchedState);
		states.add(this.preDeployedState);
		states.add(this.deployingState);
		states.add(this.deployedState);
		states.add(this.missionCompleteState);
		
	}

	public State getCurrentState() {
		return this.states.get(currentState);
	}

	public void nextState() {
		if (this.currentState < states.size()) {
			this.currentState++;
		}
	}
}