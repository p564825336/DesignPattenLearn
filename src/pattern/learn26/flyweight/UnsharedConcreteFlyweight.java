package pattern.learn26.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("���������: " + extrinsicstate);
	}

}
