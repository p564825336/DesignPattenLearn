package pattern.learn21.singleton;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-23 ����10:55:18 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		Singleton01Lazy s1 = Singleton01Lazy.GetInstance();
		Singleton01Lazy s2 = Singleton01Lazy.GetInstance();
		if (s1 == s2) {
			System.out.println("������������ͬ��ʵ��");
		}
	}

}
