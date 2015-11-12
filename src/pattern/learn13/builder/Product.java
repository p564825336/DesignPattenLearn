package pattern.learn13.builder;

import java.util.ArrayList;

public class Product {
	private ArrayList<String> parts = new ArrayList<String>();
	
	public void Add(String part){
		parts.add(part);
	}
	
	public void Show(){
		System.out.println("产品 创建 ----");
		for (String part : parts) {
			System.out.println(part);
		}
	}

}
