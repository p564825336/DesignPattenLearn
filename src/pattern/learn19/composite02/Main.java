package pattern.learn19.composite02;


public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-31 下午2:42:24 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConreteCompany root = new ConreteCompany("北京总公司");
		root.Add(new HRDepartment("总公司人力资源部"));
		root.Add(new FinanceDepartment("总公司财务部"));
		
		ConreteCompany comp = new ConreteCompany("上海华东分公司");
		comp.Add(new HRDepartment("华东分公司人力资源部"));
		comp.Add(new FinanceDepartment("华东分公司财务部"));
		root.Add(comp);
		
		
		ConreteCompany comp1 = new ConreteCompany("南京办事处");
		comp1.Add(new HRDepartment("南京办事处人力资源部"));
		comp1.Add(new FinanceDepartment("南京办事处财务部"));
		comp.Add(comp1);
		
		
		ConreteCompany comp2 = new ConreteCompany("杭州办事处");
		comp2.Add(new HRDepartment("杭州办事处人力资源部"));
		comp2.Add(new FinanceDepartment("杭州办事处财务部"));
		comp.Add(comp2);
		
		System.out.println("结构图");
		root.Display(1);
		
		System.out.println("职责");
		root.LineOfDuty();
		
		
		
	}

}
