package pattern.learn17.adapter02;

public class Guards extends Player {
	private String name;

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("ÖÐ·æ: " + name + " ½ø¹¥");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("ÖÐ·æ: " + name + " ·ÀÊØ");

	}

}
