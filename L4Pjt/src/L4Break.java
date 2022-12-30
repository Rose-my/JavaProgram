import java.util.Scanner;
public class L4Break {
	public static void main(String args[]) {
		//"exit"이 입력되면 while문을 벗어나고 break문을 활용하는 프로그램 작성
		Scanner value=new Scanner(System.in);
		
		while(true){
			System.out.printf("텍스트를 입력하세요: ");
			String text=value.nextLine();
			if (text.equals("exit")) {
			break;
			}
		}
		System.out.println("종료합니다");
		value.close();
	}
}
