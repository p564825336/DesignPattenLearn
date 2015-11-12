package pattern.learn17.adapter;

public class Adapter extends Target {
	
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}

	
}
