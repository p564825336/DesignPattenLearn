package pattern.learn15.abstract_factory04;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

	public static String getPropertiesValue(){
		Properties properties = new Properties();
		try {
			properties.load(PropertiesUtils.class.getClassLoader().getResourceAsStream("pattern/learn15/abstract_factory04/app.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String propertyValue = properties.getProperty("db");
		
//		System.out.println("O(¡É_¡É)O¹þ¹þ~:¡¡¡¡" + propertyValue);
		return propertyValue;
	}
	
	
}
