package pattern.learn16.state02;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 13) {
			System.out.println("��ǰʱ��: " + w.getHour() + "��, ����, �緹: ����, ����");
		}else {
			w.setState(new AfternoonState());
			w.WriteProgram();
		}
	}

}
