
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.breed = "��Ʈ����";
		dog1.color = "���";
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		Dog dog2 = new Dog("��",3,"��");
		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		String str = dog2.toPrint("Ǫ��", 7, "����");
		System.out.println(str);
	}

}
