package pattern.learn25.mediator02;

public class Iraq extends Country {

	private UnitedNations nations;
	
	public Iraq(UnitedNations nations) {
		super(nations);
		// TODO Auto-generated constructor stub
		this.nations = nations;
	}

	public void declare(String message){
		nations.declare(message, this);
	}
	
	public void getMessage(String message){
		System.out.println("Iraq_get: " + message);
	}
}
