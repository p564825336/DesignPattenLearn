package pattern.learn21.singleton;

/**
 * ����,�̲߳���ȫ��
 * @������: Singleton
 * @������: TODO
 * @�����ˣ�PengBo
 * @����ʱ�䣺2015-7-23 ����11:29:20 
 * @��ע��
 */
public class Singleton01Lazy {

	private static Singleton01Lazy instance;
	private Singleton01Lazy(){
		
	}
	
	public static Singleton01Lazy GetInstance(){
		if(instance == null){
			instance = new Singleton01Lazy();
		}
		return instance;
	}
}
