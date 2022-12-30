import java.util.Scanner;
public class L5ArrayLength {

	public static void main(String[] args) {
		// 배열의 length필드를 이용하여 배열의 크기만큼 정수를 입력받고 평균 구하기
		Scanner value=new Scanner(System.in);
		int Array[];
		Array=new int[5];
		int sum=0;
		System.out.print(Array.length+ "개의 "+ "정수를 입력하세요: ");
		for(int i=0; i<Array.length;i++) {
			Array[i] =value.nextInt(); //키보드에서 입력받은 정수 저장
			sum+=Array[i]; //배열에 저장된 정수 값을 더하기
		}
		System.out.println("평균 값은 "+sum/Array.length);
		value.close();
	}

}
