public class Book {

	
	//������
	Book(String name, int count){
		bookName = name;
		this.count = count;
	}
	
	
	//��� ���� - å�̸�,���
	String bookName;
	private int count;
	
	
	//�޼ҵ�
	// ���� ����� å�� �̸��� ��� ����ϴ� �޼ҵ�
	void printBookCount() {
		System.out.println(bookName + ":" + count + "�� ��� ����");
	}
	
	//å�� count �� ��ŭ �����ϴ� �޼ҵ�
	void rentalBook(int count) {
		if(count > this.count) {
			System.out.println(bookName + " �������," + " �������:" + this.count);
		}
		else {
			this.count = this.count - count;
			System.out.println(bookName + ":" + count + "����");
			printBookCount();
		}
	}
	
	//å�� �ݳ��ϴ� �޼ҵ�
	void returnBook(int count) {
		this.count += count;
		System.out.println(bookName + ":" + count + "�� �ݳ�, " + this.count + "�� ��� ����");
	}
}
