package pattern.learn14.observer;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-10 ����3:34:49 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
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
