package pattern.learn28.visitor;

public class ConcreteElementB extends Element {

	@Override
	public void Accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.VisitConcreteElementB(this);
	}

	public void OperationB(){
		
	}
}
