package pattern.learn12.facade;

public class Facade {

	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("methodA: ");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}
	
	public void methodB(){
		System.out.println("methodB: ");
		two.methodTwo();
		three.methodThree();
	}
	
	
}
