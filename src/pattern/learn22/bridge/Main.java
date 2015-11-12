package pattern.learn22.bridge;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-3 ����11:06:24 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandsetBrand ab;
		ab = new HandsetBrandN();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
		ab = new HandsetBrandM();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
	}

}
