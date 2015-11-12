package pattern.learn26.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

	private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();
	
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}
