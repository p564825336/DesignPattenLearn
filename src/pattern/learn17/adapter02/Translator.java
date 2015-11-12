package pattern.learn17.adapter02;

public class Translator extends Player {
	private ForeignCenter foreignCenter = new ForeignCenter();

	public Translator(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		foreignCenter.setName(name);
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		foreignCenter.chinaAttack();
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		foreignCenter.chinaDeffense();
	}

}
