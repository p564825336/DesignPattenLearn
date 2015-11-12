package pattern.learn27.interpreter02;

public class Main {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-8-4 下午5:49:56 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		System.out.println("Music");
		context.setText(" O 2 E 0.5 ");
		
		Expression expression = null;
		while (context.getText().length() > 0) {
			String str = context.getText().substring(0, 1);
			System.out.println("str: " + str);
			if("O".equals(str)){
				expression = new Scale();
			}else if ("C".equals(str)) {
				expression = new Note();
			}else if ("D".equals(str)) {
				expression = new Note();
			}else if ("E".equals(str)) {
				expression = new Note();
			}else if ("F".equals(str)) {
				expression = new Note();
			}else if ("G".equals(str)) {
				expression = new Note();
			}else if ("A".equals(str)) {
				expression = new Note();
			}else if ("B".equals(str)) {
				expression = new Note();
			}else if ("P".equals(str)) {
				expression = new Note();
			}
			
			expression.interpret(context);
		}
	}

}
