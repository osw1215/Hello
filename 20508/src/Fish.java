
public class Fish extends Animal {

	//������ ���ġ��
	//"�ݺؾ ���Ĩ�ϴ�."�� ����ϴ� �޼ҵ� �߰�
	
	void Swim() {
		System.out.println(name + "�� ����� Ĩ�ϴ�.");
	}
	
	public static void main(String[] args) {
		
		Fish myfish = new Fish();
		myfish.name = "�˷���";
		myfish.setage(3);
		myfish.Swim();
		
	}

}
