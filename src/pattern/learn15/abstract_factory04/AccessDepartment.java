package pattern.learn15.abstract_factory04;

public class AccessDepartment implements IDepartment {

	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и�Department������һ����¼");
	}

	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и�����ID�õ�Department��һ����¼");
		return null;
	}

}
