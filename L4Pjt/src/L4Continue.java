import java.util.Scanner;
public class L4Continue {
	//5개의 정수를 입력 받고 그 중 양수들만 합하여 출력
	public static void main(String args[]){
		Scanner value=new Scanner(System.in);
		
		int sum=0;
		int count;
		for(count=1;count<=5;count++) {
			System.out.print("정수를 입력하세요: ");
			int num=value.nextInt();
			if(num>=1) {
				sum+=num;
			}
			else {
				continue;
			}	
		}
		System.out.print("합은 "+sum+"입니다");
		value.close();
	}
}
