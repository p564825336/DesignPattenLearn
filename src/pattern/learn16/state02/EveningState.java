package pattern.learn16.state02;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.isFinish()) {
			w.setState(new RestState());
			w.WriteProgram();
		}else {
			if (w.getHour() < 21) {
				System.out.println("当前时间: " + w.getHour() + "加班哦, 疲惫至极...");
				
			}else {
				w.setState(new SleepingState());
				w.WriteProgram();
			}
		}
	}

}
