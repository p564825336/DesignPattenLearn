package pattern.learn15.abstract_factory02;

public class AccessUser implements IUser {

	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и�User������һ����¼");
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и�����ID�õ�User��һ����¼");
		return null;
	}

}
