package pattern.learn19.composite;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-31 下午1:55:32 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite root = new Composite("root");
		root.Add(new Leaf("Leaf A"));
		root.Add(new Leaf("Leaf B"));
		
		Composite comp = new Composite("Composite X");
		comp.Add(new Leaf("Leaf XA"));
		comp.Add(new Leaf("Leaf XB"));
		
		root.Add(comp);
		
		Composite comp2 = new Composite("Composite XY");
		comp2.Add(new Leaf("Leaf XYA"));
		comp2.Add(new Leaf("Leaf XYB"));
		comp.Add(comp2);
		
		root.Add(new Leaf("Leaf C"));
		
		Leaf leaf = new Leaf("Leaf D");
		root.Add(leaf);
		root.Remove(leaf);
		
		root.Display(1);
	}

}
