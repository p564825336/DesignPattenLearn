package pattern.learn21.singleton;

/**
 * 懒汉,线程不安全的
 * @类名称: Singleton
 * @类描述: TODO
 * @创建人：PengBo
 * @创建时间：2015-7-23 上午11:29:20 
 * @备注：
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
