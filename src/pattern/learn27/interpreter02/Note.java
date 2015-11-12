package pattern.learn27.interpreter02;

public class Note extends Expression {

	@Override
	public void excute(String key, double value) {
		// TODO Auto-generated method stub
		String note = "";
		if ("C".equals(key)) {
			note = "1";
		}else if ("D".equals(key)) {
			note = "2";
		}else if ("E".equals(key)) {
			note = "3";
		}else if ("F".equals(key)) {
			note = "4";
		}else if ("G".equals(key)) {
			note = "5";
		}else if ("A".equals(key)) {
			note = "6";
		}else if ("B".equals(key)) {
			note = "7";
		}
		
		System.out.println("note: " + note);
	}

	
}
