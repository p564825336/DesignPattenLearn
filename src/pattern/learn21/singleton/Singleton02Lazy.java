package pattern.learn21.singleton;

/**
 * ����,�̰߳�ȫ,���ǵ�Ч
 * @������: Singleton
 * @������: TODO
 * @�����ˣ�PengBo
 * @����ʱ�䣺2015-7-23 ����11:29:20 
 * @��ע��
 */
public class Singleton02Lazy {

	private static Singleton02Lazy instance;
	private Singleton02Lazy(){
		
	}
	
	public static synchronized Singleton02Lazy GetInstance(){
		if(instance == null){
			instance = new Singleton02Lazy();
		}
		return instance;
	}
}
