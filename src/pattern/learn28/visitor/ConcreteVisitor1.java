package pattern.learn28.visitor;

public class ConcreteVisitor1 extends Visitor {

	@Override
	public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getClass().getSimpleName() + "��" + this.getClass().getSimpleName() + "����");
	}

	@Override
	public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getClass().getSimpleName() + "��" + this.getClass().getSimpleName() + "����");

	}

}
