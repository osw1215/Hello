
public class ItemMain_1 {

	public static void main(String[] args) {
		
		System.out.println(Item_1.getCompany() + "�� ���Ű��� ȯ���մϴ�!!!!!!" );
		System.out.println("�츮ȸ�� ���� ��ǰ ���� :" + Item_1.getItemCnt());
		
		Item_1 item1 = new Item_1();
		item1.setNo("100");
		item1.setName("����");
		item1.setPrice(6000);
		item1.setCount(5);
		
		Item_1 item2 = new Item_1("101", "��Ʈ");
		item2.setPrice(1000);
		item2.setCount(4);

		Item_1 item3 = new Item_1("102", "���찳",500, 5);
		System.out.println("========"+  Item_1.getCompany()    +"==============");
		item1.toPrint();
		item2.toPrint();
		item3.toPrint();
		
		System.out.println("�츮ȸ�� ���� ��ǰ ���� :" + Item_1.getItemCnt());
		System.out.println("======================");
		item1.inStore(10);			//item1�� ���� ��ü, ���� 10�� �԰�
		item2.inStore(20);
		item2.outStore(5);          //item2�� ��Ʈ ��ü, ��Ʈ 5�� ��� 
		item3.inStore(20);           
		item3.outStore(30);
		System.out.println("======================");
		item1.toPrint();
		item2.toPrint();
		item3.toPrint();
		
	}

}