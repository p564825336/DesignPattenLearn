package pattern.learn15.abstract_factory;


public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-5 上午11:11:07 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		SqlserverUser su = new SqlserverUser();
		su.insert(user);
		su.getUser(1);
		
	}

}
