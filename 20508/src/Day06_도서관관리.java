import java.util.Scanner;

public class Day06_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("JAVA ������",10);
		b1.printBookCount();
		
		Book b2 = new Book("���̽� ����",20);
		b2.printBookCount();
		
		Book b3 = new Book("��������",100);
		b3.printBookCount();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("���Ͻô� �۾��� �������ּ���[1:����, 2:�ݳ�]:");
		int job = sc.nextInt();
		
		if(job == 1) {
			System.out.print("���ϴ� ����:");
			int count = sc.nextInt();
			b3.rentalBook(count);
		}else {
			System.out.print("�ݳ��� ����:");
			int count = sc.nextInt();
			b3.returnBook(count);
		}
		
		//b3.rentalBook(10);
		//b3.rentalBook(20);
		
		//b3.returnBook(20);
	}
	}
}
