package pattern.learn23.command02;


public class ConcreteCommand extends Command {

	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

	

}
