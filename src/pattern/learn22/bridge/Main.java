package pattern.learn22.bridge;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 上午11:06:24 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
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
