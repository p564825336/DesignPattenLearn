package pattern.learn18.memento02;

public class GameRole {

	private int vit;//体力
	private int atk;//攻击
	private int def;//防御
	
	
	
	public int getVit() {
		return vit;
	}



	public void setVit(int vit) {
		this.vit = vit;
	}



	public int getAtk() {
		return atk;
	}



	public void setAtk(int atk) {
		this.atk = atk;
	}



	public int getDef() {
		return def;
	}



	public void setDef(int def) {
		this.def = def;
	}



	public void stateDisplay(){
		System.out.println("当前状态: ");
		System.out.println("体力: " + vit);
		System.out.println("攻击: " + atk);
		System.out.println("防御: " + def);
	}
	
	//获取初始状态
	public void getInitState(){
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	//战斗
	public void fight(){
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	//保存角色状态
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vit, atk, def);
	}
	
	//恢复角色状态
	public void recoveryState(RoleStateMemento memento){
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}
}
