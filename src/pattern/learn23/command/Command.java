package pattern.learn23.command;

public abstract class Command {

	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver){
		this.receiver = receiver;
	}
	
	abstract public void Excute();
}
