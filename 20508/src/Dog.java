
public class Dog {

	Dog(){}
	
	Dog(String breed,int age, String color){
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	
	String breed;
	int age;
	String color;
	
	void barking() {
		System.out.println(breed + "��(��) ¢���");
	}
	
	void hungry() {
		System.out.println(breed + "��(��) ����Ŀ�");
	}
	
	void sleeping() {
		System.out.println(breed + "��(��) ���ڿ�");
	}
	
	String toPrint(String breed, int age, String color) {
		String str = "(" + breed + ":" + age + ":" + color + ")";
		return str;
	}

}
