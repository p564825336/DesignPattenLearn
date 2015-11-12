package pattern.learn17.adapter02;

public class Forwards extends Player {
	private String name;

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Ç°·æ: " + name + " ½ø¹¥");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Ç°·æ: " + name + " ·ÀÊØ");

	}

}
