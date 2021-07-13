
public class AllCarMain {

	public static void main(String[] args) {
		AllCar sonata = new AllCar();
		sonata.carname="소나타";
		sonata.velocity = 0;
		
		sonata.speedUp();
		sonata.speedUp();
		
		sonata.speedDown();
		
		//-----------
		//상속받은 Truck에 관한 소스
		
		Truck t1 = new Truck();
		t1.carname = "포터";
		t1.speedUp();
		t1.speedDown();

		
		sonata.print();
		
		t1.color = "파랑색";
		t1.ton = 3;
		
		t1.print();
		
		Taxi taxi = new Taxi();
		taxi.carname = "카카오택시";
		taxi.payUp();
		taxi.payUp();
		taxi.payUp();
		taxi.print();
		taxi.speedUp();
	}

}
