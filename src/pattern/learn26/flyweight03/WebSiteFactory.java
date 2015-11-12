package pattern.learn26.flyweight03;

import java.util.Hashtable;

public class WebSiteFactory {

	private Hashtable<String, WebSite> flyweights = new Hashtable<String, WebSite>();
	
	public WebSite getWebSiteCategory(String key){
		if(!flyweights.containsKey(key)){
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}
	
	public int getWebSiteCount(){
		return flyweights.size();
	}
}
