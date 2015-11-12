package pattern.learn06.decorator;

public class ConreteDecoratorB extends Decorator {
	
	private void addedBehavior(){
		
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	
}
