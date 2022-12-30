import java.util.Scanner;
public class L4While {
	//while문을 이용해서 정수를 여러개 입력받고 평균을 출력하되 -1이 입력되면 입력 종료
	public static void main (String args[]) {
		Scanner value= new Scanner(System.in);
		int sum=0;
		int count=0;
		System.out.print("정수를 입력하세요: ");
		int num=value.nextInt();
		while(num!=-1) {
			sum+=num;
			count++;
			System.out.print("정수를 입력하세요: ");
			num=value.nextInt();
		}
		if (count==0) {
			System.out.printf("입력된 수가 없습니다");
		}
		else
			System.out.printf("정수의 개수는 "+count+"개이고 ");
			System.out.printf("평균은 "+(double)sum/count+"입니다");
	}

}