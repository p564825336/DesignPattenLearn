package pattern.learn15.abstract_factory03;

public class AccessFactory implements IFactory {

	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}

}
