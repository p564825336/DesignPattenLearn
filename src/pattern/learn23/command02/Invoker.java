package pattern.learn23.command02;

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}

	public void ExecuteCommand(){
		command.execute();
	}
}
