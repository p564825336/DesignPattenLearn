package pattern.learn20.iterator;

public abstract class Iterator {

	//���ڶ���õ���ʼ����,�õ���һ������, �ж��Ƿ񵽽�β, ��ǰ����ȳ��󷽷�
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean IsDone();
	public abstract Object CurrentItem();

}
