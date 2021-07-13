
public class PizzaMain {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.setSize(12);
		p1.setType("슈퍼슈프림");
		
		Pizza p2 = new Pizza("포테이토");
		p2.setSize(14);
		
		Pizza p3 = new Pizza(12,"불고기");
		
		p1.toPrint();
		p2.toPrint();
		p3.toPrint();
	}

}
