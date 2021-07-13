
public class CircleMain  extends Circle {
	
	public static void main(String[] args) {
		
		CircleMain c = new CircleMain();
		System.out.println("원의 넓이: " + c.area(5));
		System.out.println("원의 둘레: " + c.round(5));
	}
}
