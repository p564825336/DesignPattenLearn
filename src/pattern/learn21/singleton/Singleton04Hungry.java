package pattern.learn21.singleton;

/**
 * ����
 * @������: Singleton04
 * @������: TODO
 * @�����ˣ�PengBo
 * @����ʱ�䣺2015-7-23 ����1:49:35 
 * @��ע��
 */
public class Singleton04Hungry {

	private static Singleton04Hungry instance = new Singleton04Hungry();
	private Singleton04Hungry(){
		
	}
	
	public static Singleton04Hungry GetInstance(){
		return instance;
	}
}
