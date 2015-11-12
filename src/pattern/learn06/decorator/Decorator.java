package pattern.learn06.decorator;

public abstract class Decorator extends Component {

	private Component component;
	
	//����Component
	public void setComponent(Component component){
		this.component = component;
	}
	
	//��дOperation(), ʵ��ִ�е���Component��Operation();
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		if (component != null) {
			component.Operation();
			
		}
	}

}
