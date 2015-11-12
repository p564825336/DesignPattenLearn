package pattern.learn17.adapter02;

public class Center extends Player {
	private String name;

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("����: " + name + " ����");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("����: " + name + " ����");

	}

}
