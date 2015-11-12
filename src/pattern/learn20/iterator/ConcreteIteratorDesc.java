package pattern.learn20.iterator;

public class ConcreteIteratorDesc extends Iterator {

	//定义了一个具体聚集对象
	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIteratorDesc(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
		current = aggregate.getCount() - 1;
	}
	
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.getObject(aggregate.getCount() - 1);
	}

	@Override
	public Object Next() {
		Object ret = null;
		current --;
		if (current >= 0) {
			ret = aggregate.getObject(current);
		}
		return ret;
	}

	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return current < 0 ? true : false;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.getObject(current);
	}

}
