import java.util.Scanner;

public class Day04_¹Ýº¹¹®4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N: ");
		int N = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= N) {
			
			if(i % 2 == 1) {
				sum+=i;
				System.out.print("+" + i);
			}
			else {
				sum-=i;
				System.out.print("-" + i);
			}
			i++;
		}
		
		System.out.println("=" + sum);
		
		
				

	}

}
