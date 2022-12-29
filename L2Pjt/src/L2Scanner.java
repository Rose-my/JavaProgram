import java.util.Scanner; //임포트 문
//Scanner 연습
public class L2Scanner {
	public static void main(String[] args) {
		Scanner value= new Scanner(System.in);
		System.out.print("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		String name =value.next();
		System.out.print("당신의 이름은 " + name+", ");
		String city=value.next();
		System.out.print("당신이 사는 도시는 "+city+", ");
		int age=value.nextInt();
		System.out.print("당신의 나이는 "+age+", ");
		double weight=value.nextDouble();
		System.out.print("당신의 몸무게는 "+weight+", ");
		boolean single =value.nextBoolean();
		System.out.println("독신여부는 "+single+"입니다");
		
		value.close();
		
	
	}

}
