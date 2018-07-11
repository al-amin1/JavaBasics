package inheritance;

public class InheritanceMain {
	String b;

	public static void main(String[] args) {
		Parent[] p = new Parent[3];
		p[0] = new ChildA("sd","sdjkds","ewur");
		p[1] = new ChildB("sd","sdjkds","ewur");
		p[2] = new ChildC("sd","sdjkds","ewur");
		Parent.doSomething();
		for(Parent pr : p){
			System.out.println(pr.getInfo());
		}
		
		ChildA a = new ChildA("sd","sdjkds","ewur");
		ChildB b = new ChildB("sd","sdjkds","ewur");
		ChildC c = new ChildC("sd","sdjkds","ewur");
		
		
		ChildA.sString = "BASIS-BITM";
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.sString);
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.sString);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.sString);
	}

}
