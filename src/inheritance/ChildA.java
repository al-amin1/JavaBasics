package inheritance;

public class ChildA extends Parent{

	String pro_A;
	
	
	public ChildA(String a, String b, String pro_A) {
		super(a, b);
		this.pro_A = pro_A;
	}


	@Override
	public String getInfo() {
		return "from child A";
	}
	
}
