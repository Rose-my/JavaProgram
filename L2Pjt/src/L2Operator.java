import java.util.Scanner;
//연산자 연습
public class L2Operator {
	public static void main(String[] args) {
		Scanner value= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int time=value.nextInt();
		int second=time%60; //60으로 나눈 나머지는 초
		int minute=(time/60)%60; //60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour=(time/60)/60; //60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		System.out.print(time +"초는 ");
		System.out.print(hour+"시간 ");
		System.out.print(minute+"분 ");
		System.out.print(second+"초 입니다.");
		value.close();
	}
}