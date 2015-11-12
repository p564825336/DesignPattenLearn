package pattern.learn25.mediator02;

public class UnitedNationsSecurityCouncil extends UnitedNations {

	private USA c1;
	private Iraq c2;
	
	public USA getC1() {
		return c1;
	}

	public void setC1(USA c1) {
		this.c1 = c1;
	}

	public Iraq getC2() {
		return c2;
	}

	public void setC2(Iraq c2) {
		this.c2 = c2;
	}

	@Override
	public void declare(String message, Country country) {
		// TODO Auto-generated method stub
		if (c1 == country) {
			c2.getMessage(message);
		}else {
			c1.getMessage(message);
		}
	}

}
