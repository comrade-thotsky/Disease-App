package disease;
import java.util.*;
public class FiniteStateMachine {
	private ArrayList<State> PossibleStates = new ArrayList<State>();
	private State currentState;
	private int currentStateIndex;
	public FiniteStateMachine(ArrayList<State> stateList) {
		PossibleStates = stateList;
	}
	public void setState(int index) {
		
	}
	public void setState(String pState) {
		
	}
	public State getState(int index) {
		/* Returns the state that is of the index in possible states */
		
		// This will be changed later.
		return new State();
	}
	public State getState() {
		/* Returns the current state of the FiniteStateMachine */
		// This will be changed later.
		return new State();
	}
}
