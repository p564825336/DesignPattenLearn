package pattern.learn26.flyweight02;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-8-3 ����6:56:01 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.getWebSiteCategory("��Ʒչʾ");
		fx.use();
		
		WebSite fy = f.getWebSiteCategory("��Ʒչʾ");
		fy.use();
		
		WebSite fz = f.getWebSiteCategory("��Ʒչʾ");
		fz.use();
		
		WebSite fm = f.getWebSiteCategory("����");
		fm.use();
		
		WebSite fn = f.getWebSiteCategory("����");
		fn.use();
		
		System.out.println("��վ��������Ϊ: " + f.getWebSiteCount());;
	}
}
