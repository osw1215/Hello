
public class BaseBall extends Sports{

	BaseBall(String name, int player){
		super(name,player);
	}
	
	//�������̵�
	public void rule(){
		System.out.println("�߱��� ���ݰ� ����� �̷������....");
		}
	
	public static void main(String[] args) {
		BaseBall bb = new BaseBall("BaseBall",9);
		System.out.println("��� ���� : " + bb.getName());
		System.out.println("���� �ο� : " + bb.getPlayer() + "��");
		System.out.print("��� ��Ģ :");
		bb.rule();
	}

}

