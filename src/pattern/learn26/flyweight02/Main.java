package pattern.learn26.flyweight02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-3 下午6:56:01 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.use();
		
		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.use();
		
		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.use();
		
		WebSite fm = f.getWebSiteCategory("博客");
		fm.use();
		
		WebSite fn = f.getWebSiteCategory("博客");
		fn.use();
		
		System.out.println("网站分类总数为: " + f.getWebSiteCount());;
	}
}
