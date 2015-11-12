package pattern.learn21.singleton;

/**
 * 饿汉
 * @类名称: Singleton04
 * @类描述: TODO
 * @创建人：PengBo
 * @创建时间：2015-7-23 下午1:49:35 
 * @备注：
 */
public class Singleton04Hungry {

	private static Singleton04Hungry instance = new Singleton04Hungry();
	private Singleton04Hungry(){
		
	}
	
	public static Singleton04Hungry GetInstance(){
		return instance;
	}
}
