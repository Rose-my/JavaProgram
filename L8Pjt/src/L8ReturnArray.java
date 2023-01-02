/*정수 4개를 가지는 일차원 배열 생성하고 0 1 2 3으로 초기화한 다음, 
배열을 리턴하는 makeArray()를 작성하고, 이 메소드로부터 배열을 전달받아 값 출력 */
public class L8ReturnArray {

	static int[] makeArray() { //정수형 배열을 리턴하는 메소드
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++) 
			temp[i]=i; //배열의 원소를 0,1,2,3으로 초기화
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray=makeArray();
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + " ");
		}
		
	}
}
