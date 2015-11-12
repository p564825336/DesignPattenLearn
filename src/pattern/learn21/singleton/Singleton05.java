package pattern.learn21.singleton;

/**
 * ��̬�ڲ��� �ŵ㣺����ʱ�����ʼ����̬����INSTANCE����Ϊû������ʹ�ã��ﵽLazy loading
 * @������: Singleton05
 * @������: TODO
 * @�����ˣ�PengBo
 * @����ʱ�䣺2015-7-23 ����1:54:38 
 * @��ע��
 */
public class Singleton05 {

	private static class Singleton05Holder{
		private static Singleton05 instance = new Singleton05();
	}
	private Singleton05(){
		
	}
	
	public static Singleton05 GetInstance(){
		return Singleton05Holder.instance;
	}
}
