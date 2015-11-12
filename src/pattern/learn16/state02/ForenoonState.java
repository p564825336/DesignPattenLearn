package pattern.learn16.state02;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 12){
			System.out.println("��ǰʱ��: " + w.getHour() + "��, ���繤��, ����ٱ�");
		}else {
			w.setState(new NoonState());
			w.WriteProgram();
		}
	}

}
