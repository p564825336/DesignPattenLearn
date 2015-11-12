package pattern.learn25.mediator02;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-3 ����4:48:12 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
		USA c1 = new USA(UNSC);
		Iraq c2 = new Iraq(UNSC);
		
		UNSC.setC1(c1);
		UNSC.setC2(c2);
		
		c1.declare("hello Iraq");
		c2.declare("hi usa");
		
	}

}
