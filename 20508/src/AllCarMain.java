
public class AllCarMain {

	public static void main(String[] args) {
		AllCar sonata = new AllCar();
		sonata.carname="�ҳ�Ÿ";
		sonata.velocity = 0;
		
		sonata.speedUp();
		sonata.speedUp();
		
		sonata.speedDown();
		
		//-----------
		//��ӹ��� Truck�� ���� �ҽ�
		
		Truck t1 = new Truck();
		t1.carname = "����";
		t1.speedUp();
		t1.speedDown();

		
		sonata.print();
		
		t1.color = "�Ķ���";
		t1.ton = 3;
		
		t1.print();
		
		Taxi taxi = new Taxi();
		taxi.carname = "īī���ý�";
		taxi.payUp();
		taxi.payUp();
		taxi.payUp();
		taxi.print();
		taxi.speedUp();
	}

}
