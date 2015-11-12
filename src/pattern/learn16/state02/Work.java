package pattern.learn16.state02;

public class Work {

	private State current;
	private double hour;
	private boolean finish = false;
	public Work(){
		current = new ForenoonState();
	}
	public void setState(State s){
		current = s;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void WriteProgram(){
		current.WriteProgram(this);
	}
	
}
