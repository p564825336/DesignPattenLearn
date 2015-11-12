package pattern.learn15.abstract_factory;


public class SqlserverUser {

	public void insert(User user){
		System.out.println("在SQL Server 中给User表增加一条记录");
	}
	
	public User getUser(int id){
		System.out.println("在SQL Server 中给根据ID得到User表一条记录");
		
		return null;
	}
}
