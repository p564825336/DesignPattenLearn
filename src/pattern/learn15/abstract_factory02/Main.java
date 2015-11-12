package pattern.learn15.abstract_factory02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-5 上午11:24:02 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Department dept = new Department();
		
//		IFactory factory = new SqlServerFactory();
		IFactory factory = new AccessFactory();
		IUser iu = factory.createUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = factory.createDepartment();
		id.insert(dept);
		id.getDepartment(1);
		
		
	}

}
