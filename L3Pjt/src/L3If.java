import java.util.Scanner;
public class L3If {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score=value.nextInt();
		System.out.print("학년을 입력하세요: ");
		int year=value.nextInt();
		
		if(score>=60) {
			if(year!=4) { //4학년이 아니면 모두 합격
				System.out.println("합격");
			}
			else if(score>=70){ //4학년이고 70점이상이면 합격
				System.out.println("합격");
			}
			else //4학년이고 70점 미만이면 불합격
				System.out.println("불합격");
		}
		else { //60점 미만은 모두 불합격
			System.out.println("불합격");
		}
		value.close();
	}
}
