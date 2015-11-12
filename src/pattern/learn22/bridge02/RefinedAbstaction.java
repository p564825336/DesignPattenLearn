package pattern.learn22.bridge02;

public class RefinedAbstaction extends Abstraction {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
//		super.operation();
		implementor.operation();
	}
}
