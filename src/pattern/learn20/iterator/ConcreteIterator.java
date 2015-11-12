package pattern.learn20.iterator;

public class ConcreteIterator extends Iterator {

	//定义了一个具体聚集对象
	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.getObject(0);
	}

	@Override
	public Object Next() {
		Object ret = null;
		current ++;
		if (current < aggregate.getCount()) {
			ret = aggregate.getObject(current);
		}
		return ret;
	}

	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return current >= aggregate.getCount() ? true : false;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.getObject(current);
	}

}
