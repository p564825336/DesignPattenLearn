package pattern.learn13.builder;

public class Director {

	public void Construct(Builder builder){
		builder.BuildPartA();
		builder.BuildPartB();
	}
}
