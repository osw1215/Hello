import java.util.Scanner;

public class Day03_�ݺ���2 {

	public static void main(String[] args) {
		
		int N;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("���� : ");
		N = sc.nextInt();
				
				
		
		int even_sum = 0, odd_sum = 0;
		for(int i = 1; i <= N; i++)
			if(i % 2 == 0) even_sum += i;
			else odd_sum += i;
		System.out.println("1���� 10������ ¦���� ����" + even_sum + "�̰�" + "Ȧ���� ����" + odd_sum + "�Դϴ�.");

	}

}
