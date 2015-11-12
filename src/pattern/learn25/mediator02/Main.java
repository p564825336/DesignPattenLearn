package pattern.learn25.mediator02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 下午4:48:12 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
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
