package over;

public class child {
	void view() {
		System.out.println("this is a parent class method");
	}
	

	class parent extends child{
		void view( ) {
			System.out.println("this is a child class method");
		}	
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		 //child ob = new child ();
	 //ob.view();
	parent ob1 = new parent();
	ob1.view();
		}
	
}
	


