package pattern.learn26.flyweight03;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-3 ����8:01:07 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.getWebSiteCategory("��Ʒչʾ");
		fx.Use(new User("С��"));
		
		
		WebSite fy = f.getWebSiteCategory("��Ʒչʾ");
		fy.Use(new User("����"));
		
		
		WebSite fz = f.getWebSiteCategory("��Ʒչʾ");
		fz.Use(new User("����"));
		
		
		WebSite fl = f.getWebSiteCategory("����");
		fl.Use(new User("one"));
		
		WebSite fm = f.getWebSiteCategory("����");
		fm.Use(new User("two"));
		
		WebSite fn = f.getWebSiteCategory("����");
		fn.Use(new User("three"));
		
		System.out.println("��վ��������: " + f.getWebSiteCount());
	}

}
