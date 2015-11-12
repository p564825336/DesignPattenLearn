package pattern.learn15.abstract_factory02;

public class SqlServerFactory implements IFactory {

	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlserverUser();
	}

	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new SqlserverDepartment();
	}

}
