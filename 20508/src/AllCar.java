
public class AllCar {
	//������ �߰�
	AllCar(String name){ //�⺻�� �̿��� �����ڰ� ����� ������
	System.out.println("Test");
		System.out.println("�θ� AllCar ������");
	}
	
	AllCar(){ //�⺻���� �ݵ�� �ʿ�
		System.out.println("�θ� AllCar ������");
	}
	
	String carname;
	String color = "������";
	int velocity;
	
	void speedUp() {
		velocity += 5;
		System.out.println(carname + " ����ӵ�: " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println(carname + " ����ӵ�: " + velocity);
	}
	
	void print() {
		System.out.println(carname + color);
	}
}
