package pattern.learn15.abstract_factory03;

import pattern.learn15.abstract_factory04.PropertiesUtils;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-5 ����11:24:02 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
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
