package pattern.learn17.adapter02;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-30 ����3:04:32 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player b = new Forwards("�͵ٶ�");
		b.Attack();
		
		Player m = new Guards("��˸��׵�");
		m.Attack();
		
//		Player ym = new Center("Ҧ��");
		Player ym = new Translator("Ҧ��");
		ym.Attack();
		ym.Defense();
	}

}
