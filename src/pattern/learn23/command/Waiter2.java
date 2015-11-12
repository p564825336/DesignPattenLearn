package pattern.learn23.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter2 {

	private List<Command> orders = new ArrayList<Command>();
	
	public void setOrder(Command command){
		if (command.toString().equals("")) {
			
		}else {
			orders.add(command);
			System.out.println("增加订单: " + command.toString());
		}
	}
	
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("取消订单: " + command.toString());
	}
	
	
	public void Notify(){
		for (Command cmd : orders) {
			cmd.Excute();
		}
	}
}
