package pattern.learn06.decorator;

public class ConcreteDecoratorA extends Decorator {
	
	//����Ķ��й���, ��������ConcreteDecoratorB
	private String addedState;

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.Operation();//��������ԭComponent��Operation(), ��ִ�б���Ĺ���, ��addedState, �൱�ڶ�ԭComponent������װ��
		addedState = "New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}

	
}
