package pattern.learn20.iterator;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-31 ����4:43:50 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate a = new ConcreteAggregate();
		a.addObject("����");
		a.addObject("С��");
		a.addObject("����");
		a.addObject("����");
		a.addObject("�����ڲ�Ա��");
		a.addObject("С͵");
		
//		Iterator i = new ConcreteIterator(a);
		Iterator i = new ConcreteIteratorDesc(a);
		while (!i.IsDone()) {
			System.out.println(i.CurrentItem() + "����Ʊ");
			i.Next();
		}
	}

}
