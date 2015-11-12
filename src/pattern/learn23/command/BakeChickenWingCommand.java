package pattern.learn23.command;

public class BakeChickenWingCommand extends Command {

	private Barbecuer receiver;
	
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}

	@Override
	public void Excute() {
		// TODO Auto-generated method stub
		receiver.BakeChickenWing();
	}

}
