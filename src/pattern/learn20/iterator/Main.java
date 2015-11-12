package pattern.learn20.iterator;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-31 下午4:43:50 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate a = new ConcreteAggregate();
		a.addObject("大鸟");
		a.addObject("小菜");
		a.addObject("行李");
		a.addObject("老外");
		a.addObject("公交内部员工");
		a.addObject("小偷");
		
//		Iterator i = new ConcreteIterator(a);
		Iterator i = new ConcreteIteratorDesc(a);
		while (!i.IsDone()) {
			System.out.println(i.CurrentItem() + "请买车票");
			i.Next();
		}
	}

}
