
public class Cat extends Animal{

	public static void main(String[] args) {
		//Cat cat = new Animal(); //�Ұ��� ����<---����
		
		
		
		
		
		//UpCasting : ����<-----����
		Animal animal = new Cat(); //����
		animal.name = "�̹�";
		animal.print();
		
		
		
		//DownCasting : ���� <---����
		Cat cat = (Cat)animal;
		cat.print();
		
		cat.name = "����";
		cat.print();
		
		animal.print();
		
	}

}
