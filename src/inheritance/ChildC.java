package inheritance;

public class ChildC extends Parent{

	String pro_c;
	
	public ChildC(String a, String b, String pro_c) {
		super(a, b);
		this.pro_c = pro_c;
	}

	@Override
	public String getInfo() {
		return "from child C";
	}
	
}
