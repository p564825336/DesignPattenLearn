package pattern.learn19.composite02;

public class HRDepartment extends Company {
	private String name;
	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			s.append("-");
		}
		System.out.println(s + name);
	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name + " HRCompany");
	}

}
