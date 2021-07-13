
public class AllCar {
	//생성자 추가
	AllCar(String name){ //기본형 이외의 생성자가 선언될 때에는
	System.out.println("Test");
		System.out.println("부모 AllCar 생성자");
	}
	
	AllCar(){ //기본형이 반드시 필요
		System.out.println("부모 AllCar 생성자");
	}
	
	String carname;
	String color = "검정색";
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + " 현재속도: " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + " 현재속도: " + velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}
}
