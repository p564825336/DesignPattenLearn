package pattern.learn25.mediator;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 下午4:03:00 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator m = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		c1.send("Hello, c2");
		c2.send("Hi,,, c1");
	}
}
