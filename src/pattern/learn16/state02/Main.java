package pattern.learn16.state02;

public class Main {

	/**
	 * @��������:main
	 * @����: TODO
	 * @�����ˣ�PengBo
	 * @����ʱ�䣺2015-7-30 ����2:04:07 
	 * @��ע��     
	 * @param args   
	 * @�������ͣ�void
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
