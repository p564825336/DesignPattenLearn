package pattern.learn06.decorator;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-29 ����11:30:43 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConreteDecoratorB d2 = new ConreteDecoratorB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.Operation();
		
	}

}
