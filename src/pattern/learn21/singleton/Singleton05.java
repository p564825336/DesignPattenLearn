package pattern.learn21.singleton;

/**
 * 静态内部类 优点：加载时不会初始化静态变量INSTANCE，因为没有主动使用，达到Lazy loading
 * @类名称: Singleton05
 * @类描述: TODO
 * @创建人：PengBo
 * @创建时间：2015-7-23 下午1:54:38 
 * @备注：
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
