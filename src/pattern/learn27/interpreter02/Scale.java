package pattern.learn27.interpreter02;

public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale = "";
		
		if (value == 1.0) {
			scale = "µÕ“Ù";
		}else if(value == 2.0){
			scale = "÷–“Ù";
		}else if(value == 3.0){
			scale = "∏ﬂ“Ù";
		}
		
		System.out.println("scale: " + scale);
	}

}
