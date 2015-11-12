package pattern.learn06.decorator02;

public class Person {
	private String name;

	public Person(){
		
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.println(name);
	}

}
