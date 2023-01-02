import java.util.Scanner;
public class BookMarket {
	//전역변수 설정
    static String one="1. 고객 정보 확인하기";
	static String two="2. 장바구니 상품 목록 보기";		
	static String three="3. 장바구니 비우기";		
	static String four="4. 바구니에 항목 추가하기";		
	static String five="5. 장바구니의 항목 수량 줄이기";		
	static String six="6. 장바구니의 항목 삭제하기";		
    static String seven="7. 영수증 표시하기";		
	static String eight="8. 종료";
	
	//main 함수
	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);			
		//사용자의 정보를 입력받아 저장
		System.out.print("당신의 이름을 입력하세요 : ");
		String name=value.next();
		System.out.print("연락처를 입력하세요: ");
		int number=value.nextInt();

		int i=0;
		while(i==0) {
			//인사말 출력하고 메뉴 번호 입력
			menuIntroduction();
			int menu=value.nextInt();
			/*System.out.println("***********************************************");
			System.out.println("\t"+ShopMall);
			System.out.println("\t"+BookMall);
			System.out.println("***********************************************");
			System.out.println(" "+one +"\t"+" "+four);
			System.out.println(" "+two+"\t"+" "+five);
			System.out.println(" "+three+"\t"+"\t"+" "+six);
			System.out.println(" "+seven+"\t"+"\t"+" "+eight);
			System.out.println("***********************************************");
			System.out.print("메뉴 번호를 선택해주세요 ");
			int menu=value.nextInt(); */
			
			//메뉴 정보 출력
			switch(menu) {
			case 1:
			    //System.out.print("현재 고객 정보 :"+"\n"+"이름 "+name+"\t"+"연락처 "+number+"\n");
				menuGuestInfo(name,number);
				break;
			case 2:
				//System.out.print(two+"\n");
				menuCartItemList();
			 	break;
			case 3:
				//System.out.print(three+"\n");
				menuCartClear();
				break;
			case 4:
				//System.out.print(four+"\n");
				menuCartAddItem();
				break;
			case 5:
				//System.out.print(five+"\n");
				menuCartRemoveItemCount();
				break;
		    case 6:
				//System.out.print(six+"\n");
				menuCartRemoveItem();
				break;
			case 7:
				//System.out.print(seven+"\n");
				menuCartBill();
			    break;
			case 8:
				//System.out.print(eight+"\n"); 
				menuExit();
				i=1; //프로그램 종료
				break;
		    }
        }
		value.close();
	}
	public static void menuIntroduction() {
		var ShopMall ="Welcome to Shopping Mall";
		var BookMall ="Welcome to Book Market!";
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
	}
	public static void menuGuestInfo(String name,int number) {
		System.out.print("현재 고객 정보 :"+"\n"+"이름 "+name+"\t"+"연락처 "+number+"\n");
	}
	public static void menuCartItemList() {
		System.out.print(two+"\n");
	}
	public static void menuCartClear() {
		System.out.print(three+"\n");
	}
	public static void menuCartAddItem() {
		System.out.print(four+"\n");
	}
	public static void menuCartRemoveItemCount() {
		System.out.print(five+"\n");
	}
	public static void menuCartRemoveItem() {
		System.out.print(six+"\n");
	}
	public static void menuCartBill() {
		System.out.print(seven+"\n");
	}
	public static void menuExit() {
		System.out.print(eight+"\n"); 
		
	}

}

