package pattern.learn15.abstract_factory02;

public class AccessUser implements IUser {

	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给User表增加一条记录");
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给根据ID得到User表一条记录");
		return null;
	}

}
