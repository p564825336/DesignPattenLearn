package pattern.learn19.composite02;


public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-31 ����2:42:24 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConreteCompany root = new ConreteCompany("�����ܹ�˾");
		root.Add(new HRDepartment("�ܹ�˾������Դ��"));
		root.Add(new FinanceDepartment("�ܹ�˾����"));
		
		ConreteCompany comp = new ConreteCompany("�Ϻ������ֹ�˾");
		comp.Add(new HRDepartment("�����ֹ�˾������Դ��"));
		comp.Add(new FinanceDepartment("�����ֹ�˾����"));
		root.Add(comp);
		
		
		ConreteCompany comp1 = new ConreteCompany("�Ͼ����´�");
		comp1.Add(new HRDepartment("�Ͼ����´�������Դ��"));
		comp1.Add(new FinanceDepartment("�Ͼ����´�����"));
		comp.Add(comp1);
		
		
		ConreteCompany comp2 = new ConreteCompany("���ݰ��´�");
		comp2.Add(new HRDepartment("���ݰ��´�������Դ��"));
		comp2.Add(new FinanceDepartment("���ݰ��´�����"));
		comp.Add(comp2);
		
		System.out.println("�ṹͼ");
		root.Display(1);
		
		System.out.println("ְ��");
		root.LineOfDuty();
		
		
		
	}

}
