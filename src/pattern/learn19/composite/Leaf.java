package pattern.learn19.composite;

public class Leaf extends Component {

	private String name;
	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove from a leaf");

	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			s.append("-");
		}
		System.out.println(s.toString() + name);
	}

}
