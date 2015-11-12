package pattern.learn15.abstract_factory02;

public interface IFactory {

	IUser createUser();
	
	IDepartment createDepartment();
}
