package pattern.learn26.flyweight02;

public class ConcreteWebSite extends WebSite {
	private String name = "";
	
	public ConcreteWebSite(String name){
		this.name = name;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("ÍøÕ¾·ÖÀà: " + name);
	}

}
