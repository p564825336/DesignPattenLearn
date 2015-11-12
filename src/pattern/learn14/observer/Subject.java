package pattern.learn14.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	//���ӹ۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//�Ƴ��۲���
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//֪ͨ
	public void Notify(){
		for (Observer o : observers) {
			o.update();
		}
	}
	
}
