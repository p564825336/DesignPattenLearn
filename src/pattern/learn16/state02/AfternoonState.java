package pattern.learn16.state02;

public class AfternoonState extends State{

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 17) {
			System.out.println("��ǰʱ��: " + w.getHour() + "��, ����״̬������, ����Ŭ��");
		}else {
			w.setState(new EveningState());
			w.WriteProgram();
		}
	}

}
