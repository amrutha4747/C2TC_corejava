package staticblock;

public class StaticBlock {
static int a;
static int b;
static {
	a=10;
	b=20;
	System .out .println("hi");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System .out .println("Welcome");
		System .out .println("value of a ="+ a);
		System .out .println("value of a ="+ b);
		
	}

}
