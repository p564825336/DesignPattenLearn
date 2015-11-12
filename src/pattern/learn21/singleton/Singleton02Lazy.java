package pattern.learn21.singleton;

/**
 * 懒汉,线程安全,但是低效
 * @类名称: Singleton
 * @类描述: TODO
 * @创建人：PengBo
 * @创建时间：2015-7-23 上午11:29:20 
 * @备注：
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
