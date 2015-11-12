package pattern.learn16.state02;

public class AfternoonState extends State{

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 17) {
			System.out.println("当前时间: " + w.getHour() + "点, 下午状态还不错, 继续努力");
		}else {
			w.setState(new EveningState());
			w.WriteProgram();
		}
	}

}
