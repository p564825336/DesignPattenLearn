package pattern.learn06.decorator02;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-29 ����2:02:31 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("С��");
		System.out.println("One");
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		kk.Decorate(xc);
		dtx.Decorate(kk);
		dtx.show();
		
	}

}
