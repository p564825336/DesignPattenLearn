package pattern.learn26.flyweight;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-3 ����5:59:49 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extrinsicstate = 22;
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.operation(--extrinsicstate);

		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(--extrinsicstate);
		
	}

}
