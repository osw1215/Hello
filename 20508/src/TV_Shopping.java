//ShoppingMall을 상속받으시오
public class TV_Shopping extends ShoppingMall{

	//방송시간 추가
	String time;
	
	//코드,수량,방송시간을 기본으로 주고 생성하는 생성자를 만드시오
	TV_Shopping(String code, int total, String time){
		
		this.code = code;
		this.time = "12시 반";
		addTotal(total);
	}
	
	public static void main(String[] args) {
		
		TV_Shopping tv = new TV_Shopping("ABC123",10,"12시 반");
		
	}

}
