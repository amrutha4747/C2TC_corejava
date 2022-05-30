package staticvariablemethod;
 public class Statics {
	int j =100;
	int n=2000;
	static void a() {
		int a=2000;
		System.out.println("print from a");
		 int n=100;
		 a();
		 {
			 System.out.println("super.j");	 
		 }
	a();
		{
			 System.out.println("inside a2");	 	
		}
	 public static void  main(String[]args) {
			Statics ob1 = new Statics();
			ob1. a();
			Statics. a();
		}
	}
	
}

