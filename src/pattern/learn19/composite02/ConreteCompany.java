package pattern.learn19.composite02;

import java.util.ArrayList;
import java.util.List;

public class ConreteCompany extends Company {
	private String name;
	private List<Company> children = new ArrayList<Company>();
	
	public ConreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			s.append("-");
		}
		System.out.println(s + name);
		for (Company company : children) {
			company.Display(depth + 2);
		}
	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		for (Company company : children) {
			company.LineOfDuty();
		}
	}

}
