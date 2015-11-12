package pattern.learn14.observer;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-10 下午3:34:49 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject s = new ConcreteSubject();
		s.attach(new ConcreteObserver(s, "X"));
		s.attach(new ConcreteObserver(s, "Y"));
		s.attach(new ConcreteObserver(s, "Z"));
		
		s.setSubjectState("ABC");
		s.Notify();
	}

}
