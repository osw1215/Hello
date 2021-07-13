//부모클래스
class Father{
	
	String name;
	
	Father(String name){
		this.name = name;
		System.out.println("Father 생성자 " + this.name);
		
	}
}



//자식클래스
public class MyClass extends Father{
	
	MyClass(String name){
		super(name); //상위클래스 생성자를 호출하는 메소드
		System.out.println("MyClass 생성자 " + super.name);
	}
	
	public static void main(String[] args) {
		MyClass a = new MyClass("홍길동");
	}
}
