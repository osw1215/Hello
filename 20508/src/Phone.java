
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
		System.out.println(price + "����¥�� "+ model + "����Ʈ��");
	}
	
	void printTotal() {
		System.out.println("�� " + total + "���� ����Ʈ���� �ֽ��ϴ�.");
	}
}
