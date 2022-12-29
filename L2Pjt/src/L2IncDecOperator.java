public class L2IncDecOperator {

	public static void main(String[] args) {
		
		int a=3, b=3,c=3;
		
		//대입연산자 연습
		a+=4;
		b*=3;
		c%=2;
		System.out.println("a="+a+" b="+b+" c= "+c);
		int d=3;
		//증감연산자 연습
		a=d++; 
		System.out.println("a="+a+" d="+d);
		a=++d;
		System.out.println("a="+a+" d="+d);
		a=d--;
		System.out.println("a="+a+" d="+d);
		a=--d;
		System.out.println("a="+a+" d="+d);
		

	}

}
