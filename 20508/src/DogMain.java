
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.breed = "리트리버";
		dog1.color = "노랑";
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		Dog dog2 = new Dog("블독",3,"블랙");
		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		String str = dog2.toPrint("푸들", 7, "초코");
		System.out.println(str);
	}

}
