package pattern.learn23.command;

public class BakeMuttonCommand extends Command {

	private Barbecuer receiver;
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}

	@Override
	public void Excute() {
		// TODO Auto-generated method stub
		receiver.BakeMutton();
	}

}
