package pattern.learn06.decorator;

public class ConreteDecoratorB extends Decorator {
	
	private void addedBehavior(){
		
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		addedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}

	
}
