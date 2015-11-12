package pattern.learn23.command02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 下午2:37:07 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();
		i.setCommand(c);
		i.ExecuteCommand();
		
	}

}
