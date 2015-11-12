package pattern.learn19.composite;

public abstract class Component {
	
	private String name;
	public Component(String name){
		this.name = name;
	}

	public abstract void Add(Component c);
	public abstract void Remove(Component c);
	public abstract void Display(int depth);
}
