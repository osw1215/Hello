
public class Truck extends AllCar{
	
	//������ �߰�
	Truck(){
		System.out.println("�ڽ� Truck ������");
	}
	
	Truck(String name){
		System.out.println("�ڽ� Truck ������" + ": " + name);
	}
	
	int ton;
	void print() {   //�θ��� �޼ҵ带 ������ �ؼ� ��� : �������̵�
		System.out.println(carname + color + ":" + ton + "��");
	}
	
	public static void main(String[] args) {
		Truck ���� = new Truck("����");
	}
	
}
