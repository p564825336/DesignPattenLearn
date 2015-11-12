package pattern.learn25.mediator;

public class ConcreteColleague2 extends Colleague {

	private Mediator mediator;
	
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
	}

	public void send(String message){
		mediator.send(message, this);
	}
	
	public void notify(String message){
		System.out.println("ConcreteColleague2: " + message);
	}
}
