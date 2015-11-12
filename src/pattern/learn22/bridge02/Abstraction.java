package pattern.learn22.bridge02;

public abstract class Abstraction {

	protected Implementor implementor;
	public void setImplementor(Implementor implementor){
		this.implementor =  implementor;
	}
	
	public void operation(){
		implementor.operation();
	}
}
