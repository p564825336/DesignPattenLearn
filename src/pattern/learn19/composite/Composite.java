package pattern.learn19.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private String name;
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void Remove(Component c) {
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
		System.out.println(s.toString() + name);
		for (Component component : children) {
			component.Display(depth + 2);
		}
	}

}
