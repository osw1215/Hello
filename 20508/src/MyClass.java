//�θ�Ŭ����
class Father{
	
	String name;
	
	Father(String name){
		this.name = name;
		System.out.println("Father ������ " + this.name);
		
	}
}



//�ڽ�Ŭ����
public class MyClass extends Father{
	
	MyClass(String name){
		super(name); //����Ŭ���� �����ڸ� ȣ���ϴ� �޼ҵ�
		System.out.println("MyClass ������ " + super.name);
	}
	
	public static void main(String[] args) {
		MyClass a = new MyClass("ȫ�浿");
	}
}
