package pattern.learn17.adapter02;

public abstract class Player {

	private String name;
	public Player(String name){
		this.name = name;
	}
	
	public abstract void Attack();
	public abstract void Defense();
}
