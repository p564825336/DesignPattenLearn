package pattern.learn17.adapter02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-30 下午3:04:32 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player b = new Forwards("巴蒂尔");
		b.Attack();
		
		Player m = new Guards("麦克格雷迪");
		m.Attack();
		
//		Player ym = new Center("姚明");
		Player ym = new Translator("姚明");
		ym.Attack();
		ym.Defense();
	}

}
