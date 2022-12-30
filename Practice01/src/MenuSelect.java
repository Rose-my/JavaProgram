import java.util.Scanner;
public class MenuSelect {
	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		//사용자의 정보를 입력받아 저장
		System.out.print("당신의 이름을 입력하세요 : ");
		String name=value.next();
		System.out.print("연락처를 입력하세요: ");
		int number=value.nextInt();
		
		//인사말을 변수에 저장
		var ShopMall ="Welcome to Shopping Mall";
		var BookMall ="Welcome to Book Market!";
		var one="1. 고객 정보 확인하기";
		var two="2. 장바구니 상품 목록 보기";
		var three="3. 장바구니 비우기";
		var four="4. 바구니에 항목 추가하기";
		var five="5. 장바구니의 항목 수량 줄이기";
		var six="6. 장바구니의 항목 삭제하기";
		var seven="7. 영수증 표시하기";
		var eight="8. 종료";
		
		int i=0;
		while(i==0) {
			//인사말 출력하고 메뉴 번호 입력
			System.out.println("***********************************************");
			System.out.println("\t"+ShopMall);
			System.out.println("\t"+BookMall);
			System.out.println("***********************************************");
			System.out.println(" "+one +"\t"+" "+four);
			System.out.println(" "+two+"\t"+" "+five);
			System.out.println(" "+three+"\t"+"\t"+" "+six);
			System.out.println(" "+seven+"\t"+"\t"+" "+eight);
			System.out.println("***********************************************");
			System.out.print("메뉴 번호를 선택해주세요 ");
			int menu=value.nextInt();  
			
			//메뉴 정보 출력
			switch(menu) {
			case 1:
			    System.out.print("현재 고객 정보 :"+"\n"+"이름 "+name+"\t"+"연락처 "+number+"\n");
				break;
			case 2:
				System.out.print(two+"\n");
			 	break;
			case 3:
				System.out.print(three+"\n");
				break;
			case 4:
				System.out.print(four+"\n");
				break;
			case 5:
				System.out.print(five+"\n");
				break;
		    case 6:
				System.out.print(six+"\n");
				break;
			case 7:
				System.out.print(seven+"\n");
			    break;
			case 8:
				System.out.print(eight+"\n"); 
				i=1; //프로그램 종료
				break;
		    }
        }
		value.close();
	}

}


