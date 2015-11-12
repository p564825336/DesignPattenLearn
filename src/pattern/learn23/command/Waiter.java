package pattern.learn23.command;

public class Waiter {

	private Command command;
	
	public void setOrder(Command command){
		this.command = command;
	}
	
	public void Notify(){
		command.Excute();
	}
}
