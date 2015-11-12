package pattern.learn06.decorator02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-29 下午2:02:31 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("小菜");
		System.out.println("One");
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		kk.Decorate(xc);
		dtx.Decorate(kk);
		dtx.show();
		
	}

}
