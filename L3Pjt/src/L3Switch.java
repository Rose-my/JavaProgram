import java.util.Scanner;
public class L3Switch {

	public static void main(String[] args) {

		Scanner value=new Scanner(System.in);
		System.out.print("무슨 커피 드릴까요?: ");
		String coffee=value.next();
		int price=0;
		
		switch (coffee) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
			price=2000;
			break;
		default:
			System.out.println("메뉴에 없습니다");
		}
		
		if(price !=0) {
			System.out.print(coffee+"는 "+price+"원입니다");
		}
		value.close();

	}

}
