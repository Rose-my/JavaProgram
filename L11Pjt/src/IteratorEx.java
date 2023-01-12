import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v= new Vector<Integer>();
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(2,100);
		
		Iterator<Integer> i = v.iterator();
		
		while(i.hasNext()) {
			int n= i.next();
			System.out.println(n);
		}
		
		int sum=0;
		i=v.iterator();
		
	}

}
