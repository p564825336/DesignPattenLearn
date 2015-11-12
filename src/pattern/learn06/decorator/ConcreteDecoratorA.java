package pattern.learn06.decorator;

public class ConcreteDecoratorA extends Decorator {
	
	//本类的独有功能, 以区别于ConcreteDecoratorB
	private String addedState;

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();//首先运行原Component的Operation(), 再执行本类的功能, 如addedState, 相当于对原Component进行了装饰
		addedState = "New State";
		System.out.println("具体装饰对象A的操作");
	}

	
}
