package pattern.learn15.abstract_factory03;

import pattern.learn15.abstract_factory04.PropertiesUtils;

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
	
		IUser iu = DataAccess.createUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = DataAccess.createDepartment();
		id.insert(dept);
		id.getDepartment(1);
		PropertiesUtils.getPropertiesValue();
	}

}
