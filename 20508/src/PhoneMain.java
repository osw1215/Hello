
public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String model = null;
		int price = 0;
		
		Phone ph1 = new Phone("s21",200);
		ph1.toPrint();
		
		Phone ph2 = new Phone("v50",85);
		ph2.toPrint();
		
		ph2.printTotal();
	}

}
