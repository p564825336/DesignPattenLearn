package pattern.learn25.mediator02;

public class USA extends Country {

	private UnitedNations nations;
	public USA(UnitedNations nations) {
		super(nations);
		// TODO Auto-generated constructor stub
		this.nations = nations;
	}

	public void declare(String message){
		nations.declare(message, this);
	}
	
	public void getMessage(String message){
		System.out.println("USA_get: " + message);
	}
}
