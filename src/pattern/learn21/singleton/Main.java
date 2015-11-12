package pattern.learn21.singleton;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-23 上午10:55:18 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		Singleton01Lazy s1 = Singleton01Lazy.GetInstance();
		Singleton01Lazy s2 = Singleton01Lazy.GetInstance();
		if (s1 == s2) {
			System.out.println("两个对象是相同的实例");
		}
	}

}
