package pattern.learn15.abstract_factory04;

public class AccessDepartment implements IDepartment {

	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给Department表增加一条记录");
	}

	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给根据ID得到Department表一条记录");
		return null;
	}

}
