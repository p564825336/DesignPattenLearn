package pattern.learn15.abstract_factory;


public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-5 ����11:11:07 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		SqlserverUser su = new SqlserverUser();
		su.insert(user);
		su.getUser(1);
		
	}

}
