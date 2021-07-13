
public class Cat extends Animal{

	public static void main(String[] args) {
		//Cat cat = new Animal(); //불가능 하위<---상위
		
		
		
		
		
		//UpCasting : 상위<-----하위
		Animal animal = new Cat(); //가능
		animal.name = "미미";
		animal.print();
		
		
		
		//DownCasting : 하위 <---상위
		Cat cat = (Cat)animal;
		cat.print();
		
		cat.name = "주주";
		cat.print();
		
		animal.print();
		
	}

}
