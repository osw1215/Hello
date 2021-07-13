
public class ShoppingMall {
	String code;
	static int total=0;
	
	ShoppingMall(){}
	
	ShoppingMall(String code){
		this.code = code;
	}
	
	void addTotal(int su) {
		total += su;
		System.out.println(code + " 현재재고량:" + total);
	}
	
	void subTotal(int su) {
		total -= su;
		System.out.println(code + " 현재재고량:" + total);
	}
	
	public static void main(String[] args) {
		ShoppingMall s = new ShoppingMall();
		s.code = "111";
		s.addTotal(1);
		s.subTotal(1);
		
		ShoppingMall s2 = new ShoppingMall();
		s2.code = "222";
		s2.addTotal(1);
		s2.subTotal(1);
		
		
	}
}
