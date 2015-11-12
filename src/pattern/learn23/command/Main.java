package pattern.learn23.command;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 下午2:10:44 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		
		Waiter girl = new Waiter();
		girl.setOrder(bakeMuttonCommand1);
		girl.Notify();
		girl.setOrder(bakeMuttonCommand2);
		girl.Notify();
		girl.setOrder(bakeChickenWingCommand1);
		girl.Notify();
		*/
		
		
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		
		Waiter2 girl = new Waiter2();
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand1);
		girl.Notify();
		
		
	}

}
