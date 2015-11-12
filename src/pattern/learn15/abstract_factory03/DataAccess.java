package pattern.learn15.abstract_factory03;

import pattern.learn15.abstract_factory04.PropertiesUtils;

public class DataAccess {

	private static final String PackageName = "pattern.learn15.abstract_factory03"; 
//	private static final String db = "Sqlserver";
//	private static final String db = "Access";
	private static final String db = PropertiesUtils.getPropertiesValue();
	
	public static IUser createUser(){
		IUser result = null;
		/*if (db.equals("Sqlserver")) {
			result = new SqlserverUser();
		}else if(db.equals("Access")){
			result = new AccessUser();
		}*/
		String className = PackageName + "." + db + "User";
		try {
			Class<?> forName = Class.forName(className);
			result = (IUser) forName.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static IDepartment createDepartment(){
		IDepartment result = null;
		/*if (db.equals("Sqlserver")) {
			result = new SqlserverDepartment();
		}else if(db.equals("Access")){
			result = new AccessDepartment();
		}*/
		String className = PackageName + "." + db + "Department";
		try {
			Class<?> forName = Class.forName(className);
			result = (IDepartment) forName.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
