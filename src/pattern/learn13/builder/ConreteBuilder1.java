package pattern.learn13.builder;

public class ConreteBuilder1 extends Builder {

	private Product product = new Product();
	
	@Override
	public void BuildPartA() {
		// TODO Auto-generated method stub
		product.Add("����A");
	}

	@Override
	public void BuildPartB() {
		// TODO Auto-generated method stub
		product.Add("����B");

	}

	@Override
	public Product GetResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
