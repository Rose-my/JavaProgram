public class Book {
	String title;
	String author;
	public Book(String t) {
		title=t; author="unknown";
	}
	public Book(String t, String a) {
		title=t; author=a;
	}
	
	public static void main(String[] args) {
		Book LittlePrince=new Book("어린왕자","생택쥐페리");
		Book LoveStory=new Book("춘향전");
		System.out.println(LittlePrince + " "+ LittlePrince.author);
		System.out.println(LoveStory+ " "+LoveStory.author);
	}
}