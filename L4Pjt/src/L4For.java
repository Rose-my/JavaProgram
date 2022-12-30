public class L4For {
	public static void main(String args[]) {
		//for문을 이용하여 1부터 10까지의 덧셈을 표시하고 합 구하기
		int i=0, sum=0;
		for(i=1;i<=10;i++) {
			System.out.print(i);
			sum+=i;
			if(i!=10) {
				System.out.print(" + ");
			}
			else {
				System.out.print( " = ");
				System.out.print(sum);
			}
		}
		
	}
}
