package pattern.learn15.abstract_factory04;

public class SqlserverUser implements IUser {

	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server 中给User表增加一条记录");
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server 中给根据ID得到User表一条记录");
		return null;
	}

}
