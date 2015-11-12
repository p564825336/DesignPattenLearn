package pattern.learn21.singleton;

/**
 * 懒汉,线程安全,双重校验锁,
 * @类名称: Singleton
 * @类描述: TODO
 * @创建人：PengBo
 * @创建时间：2015-7-23 上午11:29:20 
 * @备注：
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
