package inheritance;

public class ChildB extends Parent{
	
	String pro_B;
	
	

	public ChildB(String a, String b, String pro_B) {
		super(a, b);
		this.pro_B = pro_B;
	}



	@Override
	public String getInfo() {
		return "from child B";
	}
	
}
