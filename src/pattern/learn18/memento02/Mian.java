package pattern.learn18.memento02;

public class Mian {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-31 上午11:20:14 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameRole role = new GameRole();
		role.getInitState();//初始状态
		role.stateDisplay();//展示初始状态
		
		//保存状态
		RoleStateCaretaker caretaker = new RoleStateCaretaker();
		caretaker.setMemento(role.saveState());
		
		//战斗消耗
		role.fight();
		role.stateDisplay();
		
		//恢复状态
		role.recoveryState(caretaker.getMemento());
		role.stateDisplay();
		
	}
}
