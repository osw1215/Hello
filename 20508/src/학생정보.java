
public class �л����� {
	//������
	�л�����(){}      //��������
	�л�����(String hakbun , String name, int age, String phone){
		this.hakbun = hakbun;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	
	//�Ӽ�
	String hakbun;
	String name;
	int age;
	String phone;


	//�޼ҵ�
	private void printStudent() {
		System.out.println(name + "," + hakbun + "," + phone);
	}
}
