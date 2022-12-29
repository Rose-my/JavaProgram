import java.util.Scanner;
public class BookMarket {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		//사용자의 정보를 입력받아 저장
		System.out.print("당신의 이름을 입력하세요 : ");
		String name=value.next();
		System.out.print("연락처를 입력하세요: ");
		int number=value.nextInt();
		
		//인사말을 변수에 저장하고 출력
		var ShopMall ="Welcome to Shopping Mall";
		var BookMall ="Welcome to Book Market!";
		System.out.println("***********************************************");
		System.out.println("\t"+ShopMall);
		System.out.println("\t"+BookMall);
		System.out.println("***********************************************");
		var one=" 1. 고객 정보 확인하기";
		var two=" 2. 장바구니 상품 목록 보기";
		var three=" 3. 장바구니 비우기";
		var four=" 4. 바구니에 항목 추가하기";
		var five=" 5. 장바구니의 항목 수량 줄이기";
		var six=" 6. 장바구니의 항목 삭제하기";
		var seven=" 7. 영수증 표시하기";
		var eight=" 8. 종료";
		System.out.println(one +"\t"+four);
		System.out.println(two+"\t"+five);
		System.out.println(three+"\t"+"\t"+six);
		System.out.println(seven+"\t"+"\t"+eight);
		System.out.println("***********************************************");
		
		//메뉴 선택
		System.out.print("메뉴 번호를 선택해주세요 ");
		int menu=value.nextInt();
		System.out.println(menu+"번을 선택했습니다");
		value.close();
	}

}


