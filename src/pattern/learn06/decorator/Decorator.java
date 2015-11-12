package pattern.learn06.decorator;

public abstract class Decorator extends Component {

	private Component component;
	
	//设置Component
	public void setComponent(Component component){
		this.component = component;
	}
	
	//重写Operation(), 实际执行的是Component的Operation();
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		if (component != null) {
			component.Operation();
			
		}
	}

}
