package pattern.learn15.abstract_factory04;

public class DataAccess {

	private static final String db = "Sqlserver";
//	private static final String db = "Access";
	
	public static IUser createUser(){
		IUser result = null;
		if (db.equals("Sqlserver")) {
			result = new SqlserverUser();
		}else if(db.equals("Access")){
			result = new AccessUser();
		}
		return result;
	}
	
	public static IDepartment createDepartment(){
		IDepartment result = null;
		if (db.equals("Sqlserver")) {
			result = new SqlserverDepartment();
		}else if(db.equals("Access")){
			result = new AccessDepartment();
		}
		return result;
	}
	
}
