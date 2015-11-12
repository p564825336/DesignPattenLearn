package pattern.learn21.singleton;

/**
 * ����,�̰߳�ȫ,˫��У����,
 * @������: Singleton
 * @������: TODO
 * @�����ˣ�PengBo
 * @����ʱ�䣺2015-7-23 ����11:29:20 
 * @��ע��
 */
public class Singleton03Lazy {

	private static Singleton03Lazy instance;
	private Singleton03Lazy(){
	}
	
	public static Singleton03Lazy GetInstance(){
		if(instance == null){
			synchronized (Singleton03Lazy.class) {
				if (instance == null) {
					instance = new Singleton03Lazy();
				}
			}
		}
		return instance;
	}
}
