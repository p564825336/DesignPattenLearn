package pattern.learn06.decorator;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-29 上午11:30:43 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
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
