package pattern.learn18.memento02;

public class Mian {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-31 ����11:20:14 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameRole role = new GameRole();
		role.getInitState();//��ʼ״̬
		role.stateDisplay();//չʾ��ʼ״̬
		
		//����״̬
		RoleStateCaretaker caretaker = new RoleStateCaretaker();
		caretaker.setMemento(role.saveState());
		
		//ս������
		role.fight();
		role.stateDisplay();
		
		//�ָ�״̬
		role.recoveryState(caretaker.getMemento());
		role.stateDisplay();
		
	}
}
