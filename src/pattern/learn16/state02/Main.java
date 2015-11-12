package pattern.learn16.state02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-7-30 下午2:04:07 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work emergencyProjects = new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setHour(10);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setHour(12);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setHour(13);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setHour(14);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setHour(17);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setFinish(false);
		
		emergencyProjects.setHour(19);
		emergencyProjects.WriteProgram();
		
		emergencyProjects.setHour(22);
		emergencyProjects.WriteProgram();
		
		
		
		
	}

}
