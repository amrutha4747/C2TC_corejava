package staticvariable;

public class Static {
static int age;
public static void main(String []args) {
	
	Static ob1 =new  Static();
	Static ob2 = new Static();
 ob1.age =10;
ob2.age =20;
System.out.println("age is "+ob1.age);
System.out.println("age is"+ob2.age);
}
}
