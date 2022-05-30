package pholymorphism;

public class poly {
void add(int x,int y)
{
	System.out.println("add 2 nos"+(x+y));
}
void add(int x,int y,int z)
{
	System.out.println("add 2 nos"+(x+y+z));
}
public static void main(String [] arrays)
{
	//TODO auto-generated method sub
	poly ob1=new poly();
	ob1.add(3,4);
	ob1.add(2,3,4);
}

}
