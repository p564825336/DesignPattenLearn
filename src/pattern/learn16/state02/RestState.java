package pattern.learn16.state02;

public class RestState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("当前时间: " + w.getHour() + "下班回家了");
	}

}
