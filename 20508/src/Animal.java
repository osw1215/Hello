
public class Animal {
	//�����ϴ� ������ Ű��� Ŭ����
	
	//������
	Animal(String kind, String name, int age, String toy){
		this(kind,name, age);
		System.out.println(name+toy+"�� �����մϴ�");
	}
	
	
	Animal(String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
		count++;
	}
	
	Animal(){}
	
	
	//��� ����
	private String kind;  
	String name;
	private int age;
	private static int count;
	private String toy;
	
	//�޼ҵ�
	void printCount() {
		System.out.println("���� �� " + count + "������ �ֽ��ϴ�");
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
		System.out.println("�� ������ �̸��� " + name);
	}
}
