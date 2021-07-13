import java.util.Scanner;

public class Day03_반복문2 {

	public static void main(String[] args) {
		
		int N;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자 : ");
		N = sc.nextInt();
				
				
		
		int even_sum = 0, odd_sum = 0;
		for(int i = 1; i <= N; i++)
			if(i % 2 == 0) even_sum += i;
			else odd_sum += i;
		System.out.println("1부터 10까지의 짝수의 합은" + even_sum + "이고" + "홀수의 합은" + odd_sum + "입니다.");

	}

}
