package pattern.learn18.memento;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-31 上午10:53:33 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Originator初始状态,状态属性为On
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		//保存状态时, 由于有了很好的封装, 可以隐藏Originator的实现细节
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		//Oiginator改变了状态属性为Off
		o.setState("Off");
		o.show();
		
		//恢复原始状态
		o.setMemento(c.getMemento());
		o.show();
		
		
	}

}
