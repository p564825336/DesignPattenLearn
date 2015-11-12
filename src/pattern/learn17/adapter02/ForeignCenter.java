package pattern.learn17.adapter02;

public class ForeignCenter {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void chinaAttack(){
		System.out.println("外籍中锋: " + name + "进攻");
	}
	
	public void chinaDeffense(){
		System.out.println("外籍中锋: " + name + "防守");
	}
	
}
