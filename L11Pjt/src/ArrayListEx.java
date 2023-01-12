import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("BBH");
		a.add("when");
		a.add("where");
		System.out.println(a.size());
		
		a.add(2,"why");
		System.out.println(a);
		
		a.set(3, "HBD");
		System.out.println(a);
		
		String str= a.get(1);
		System.out.println(str);
		
		a.remove(1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);

	}

}
