package pattern.learn18.memento;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-31 ����10:53:33 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Originator��ʼ״̬,״̬����ΪOn
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		//����״̬ʱ, �������˺ܺõķ�װ, ��������Originator��ʵ��ϸ��
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		//Oiginator�ı���״̬����ΪOff
		o.setState("Off");
		o.show();
		
		//�ָ�ԭʼ״̬
		o.setMemento(c.getMemento());
		o.show();
		
		
	}

}
