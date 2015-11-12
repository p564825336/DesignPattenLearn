package pattern.learn25.mediator;

public class ConcreteColleague1 extends Colleague {

	private Mediator mediator;
	
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
	}
	
	public void send(String message){
		mediator.send(message, this);
	}
	
	public void notify(String message){
		System.out.println("ConcreteColleague1: " + message);
	}

}
