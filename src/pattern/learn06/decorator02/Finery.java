package pattern.learn06.decorator02;

public class Finery extends Person {
	private Person component;
	
	//���
	public void Decorate(Person component){
		this.component = component;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
//		super.show();
		if (component != null) {
			component.show();
		}
	}
	
	

}
