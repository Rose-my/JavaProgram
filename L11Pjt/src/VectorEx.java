import java.util.Vector;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(5);
		v.add(7);
		v.add(0);
		
		v.add(2,100);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		int sum=0;
		for(int i=0;i<v.size();i++) {
			int n= v.get(i);
			int t= v.elementAt(i);
			System.out.print(" " +n);
			sum+=n;
		}
		
		System.out.print(" 정수의 합"+sum);
	}

}
