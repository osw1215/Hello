
public class Phone {

	Phone(){
		total++;
	}
	
	Phone(String model, int price){
		this();
		this.model = model;
		this.price = price;
	}
	
	
	String model;
	int price;
	static int total;
	
	void toPrint() {
		System.out.println(price + "만원짜리 "+ model + "스마트폰");
	}
	
	void printTotal() {
		System.out.println("총 " + total + "대의 스마트폰이 있습니다.");
	}
}
