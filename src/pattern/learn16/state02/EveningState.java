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
				System.out.println("��ǰʱ��: " + w.getHour() + "�Ӱ�Ŷ, ƣ������...");
				
			}else {
				w.setState(new SleepingState());
				w.WriteProgram();
			}
		}
	}

}
