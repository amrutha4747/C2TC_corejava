package ArrayList;
import java.util.List;
import java.util.ArrayList;
public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list=new ArrayList<String>();
System.out.println("adding elements to end the list ");
list.add("A");
list.add("B");
list.add("C");
list.add("D");
list.add("E");
list.add("G");
System.out.println("ArrayListninsertion order:"+list);
System.out.println("adding an element at a specific index after B element");
list.add(2,"C");
System.out.println("ArrayListninsertion order after adding C:"+list);
System.out.println("adding an element at a specific index after E");
list.add(5,"F");
System.out.println("ArrayListninsertion order after adding F:"+list);



	}

}
