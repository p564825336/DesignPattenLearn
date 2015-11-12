package pattern.learn16.state02;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("当前时间: " + w.getHour() + "睡着了");
		
	}

}
