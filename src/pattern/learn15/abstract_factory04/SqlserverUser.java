package pattern.learn15.abstract_factory04;

public class SqlserverUser implements IUser {

	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server �и�User������һ����¼");
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server �и�����ID�õ�User��һ����¼");
		return null;
	}

}
