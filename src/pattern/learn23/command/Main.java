package pattern.learn23.command;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-3 ����2:10:44 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
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
