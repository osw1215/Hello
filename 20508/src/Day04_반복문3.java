
public class Day04_반복문3 {

	public static void main(String[] args) {
		
		
		System.out.println("1번======================");
		for(int i = 1; i <= 3; i++ ) {
			for(int j = 1; j <= 3; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}

				System.out.println("2번=====================");
		
		for(int i = 1; i <= 3; i++ ) {
			for(int j = 1; j <= 4; j++ ) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("3번=====================");
		
		for(int i = 1; i <= 4; i++ ) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		System.out.println("4번=====================");
		
		for(int i = 4; i >= 1; i-- ) {
			for(int j = i; j >= 1; j-- ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println("5번=====================");
		
		for(int i = 3; i >= 1; i-- ) {
			for(int j = i+1; j >= 1; j-- ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
