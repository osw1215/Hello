//ShoppingMall�� ��ӹ����ÿ�
public class TV_Shopping extends ShoppingMall{

	//��۽ð� �߰�
	String time;
	
	//�ڵ�,����,��۽ð��� �⺻���� �ְ� �����ϴ� �����ڸ� ����ÿ�
	TV_Shopping(String code, int total, String time){
		
		this.code = code;
		this.time = "12�� ��";
		addTotal(total);
	}
	
	public static void main(String[] args) {
		
		TV_Shopping tv = new TV_Shopping("ABC123",10,"12�� ��");
		
	}

}
