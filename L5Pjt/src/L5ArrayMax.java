import java.util.Scanner;
public class L5ArrayMax {
	
	public static void main(String[] args) {
		// 양수 5개를 입력받아 배열에 저장하고 제일 큰 수를 출력
		Scanner value=new Scanner(System.in);
		int max=0;
		int count;
		int ArrayMax[]=new int[5];
		for(count=0;count<5;count++) {
			System.out.print("정수를 입력하세요: ");
			ArrayMax[count]=value.nextInt();
			if(ArrayMax[count]>=max) {
				max=ArrayMax[count];
			}
		}
		System.out.println("제일 큰 수는 "+max);
		value.close();
	}
	
}
