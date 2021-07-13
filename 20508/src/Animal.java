
public class Animal {
	//좋아하는 동물을 키우는 클래스
	
	//생성자
	Animal(String kind, String name, int age, String toy){
		this(kind,name, age);
		System.out.println(name+toy+"를 좋아합니다");
	}
	
	
	Animal(String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
		count++;
	}
	
	Animal(){}
	
	
	//멤버 변수
	private String kind;  
	String name;
	private int age;
	private static int count;
	private String toy;
	
	//메소드
	void printCount() {
		System.out.println("현재 총 " + count + "마리가 있습니다");
	}
	
	void print(String name, int age) {
		System.out.println(name + age);
	}
	
	void print(String name) {
		System.out.println(kind+name+age);
	}
	
	
	void setToy(String toy) {
		this.toy = toy;
	}
	
	String getToy() {
		return toy;
	}
	
	void setage(int age) {
		this.age = age;
	}
	
	int getage() {
		return this.age;
	}
	
	void print() {
		System.out.println("이 동물의 이름은 " + name);
	}
}
