package inheritance;

public class Parent{
	String a;
	String b;
	static String sString = "BITM";//class property
	
	public Parent(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	public String getInfo(){
		return sString;
	}
	
	public static void doSomething(){
		
		sString = "suewriuewr";
	}
}
