package pattern.learn20.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	//返回聚集总个数
	public int getCount(){
		return items.size();
	}
	
	public Object getObject(int index){
		return items.get(index);
	}
	
	public void addObject(Object object){
		items.add(object);
	}

}
