package pattern.learn24.chain_of_responsibility;

public class ConcreteHandler3 extends Handler {

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if (request >= 20 && request < 30) {
			System.out.println(this.getClass().getSimpleName() + " ´¦ÀíÇëÇó: " + request);
		}else if(successor != null){
			successor.HandleRequest(request);
		}
	}

}
