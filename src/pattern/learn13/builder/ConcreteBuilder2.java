package pattern.learn13.builder;

public class ConcreteBuilder2 extends Builder {
	
	private Product product = new Product();

	@Override
	public void BuildPartA() {
		// TODO Auto-generated method stub
		product.Add("部件X");
	}

	@Override
	public void BuildPartB() {
		// TODO Auto-generated method stub
		product.Add("部件Y");

	}

	@Override
	public Product GetResult() {
		// TODO Auto-generated method stub
		return 	product;
	}

}
