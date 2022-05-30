package haipg;


class superclass {
void display()
{
	System.out.println("i m super class");
}
}
public class subclass extends superclass{
	void display2()
	{
	System.out.println("i am sub class");	
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
      subclass ob= new subclass();
      ob.display();
      ob.display();
	}

}


