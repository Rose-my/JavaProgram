public class Circle {
	int radius; //원의 반지름 필드
	String name; //원의 이름 필드
	public Circle() {} //원의 생성자
	public double getArea() { //원의 면적 계산 메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza=new Circle();//Circle 객체 생성
		pizza.radius=10;
		pizza.name="shrimp";
		double area=pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
		
		Circle donut=new Circle();//Circle 객체 생성
		donut.radius=10;
		donut.name="steak";
		area=donut.getArea();
		System.out.println(donut.name + "의 면적은 "+area);
	}

}