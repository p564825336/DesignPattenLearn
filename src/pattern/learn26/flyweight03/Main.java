package pattern.learn26.flyweight03;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 下午8:01:07 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.Use(new User("小菜"));
		
		
		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.Use(new User("大鸟"));
		
		
		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.Use(new User("娇娇"));
		
		
		WebSite fl = f.getWebSiteCategory("博客");
		fl.Use(new User("one"));
		
		WebSite fm = f.getWebSiteCategory("博客");
		fm.Use(new User("two"));
		
		WebSite fn = f.getWebSiteCategory("博客");
		fn.Use(new User("three"));
		
		System.out.println("网站分类总数: " + f.getWebSiteCount());
	}

}
