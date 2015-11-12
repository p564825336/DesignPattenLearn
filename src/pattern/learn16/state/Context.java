package pattern.learn16.state;

public class Context {
	private State state;
	public Context(State state){
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
		System.out.println("��ǰ״̬: " + this.state);
	}
	
	public void request(){
		state.Handle(this);
	}

}
