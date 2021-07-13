
public class Fish extends Animal {

	//물고기는 헤엄치다
	//"금붕어가 헤엄칩니다."를 출력하는 메소드 추가
	
	void Swim() {
		System.out.println(name + "가 헤엄을 칩니다.");
	}
	
	public static void main(String[] args) {
		
		Fish myfish = new Fish();
		myfish.name = "알록이";
		myfish.setage(3);
		myfish.Swim();
		
	}

}
