package pattern.learn24.chain_of_responsibility;

public class ConcreteHandler1 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if (request >= 0 && request < 10) {
			System.out.println(this.getClass().getSimpleName() + " ´¦ÀíÇëÇó: " + request);
		}else if(successor != null){
			successor.HandleRequest(request);
		}
	}

}
