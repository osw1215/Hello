
public class Day04_String {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Java2";
		
		if(str1 == str2) {
			System.out.println("주소동일");
		}
		else
			System.out.println("주소동일하지 않음");

		
		
		if(str1.equals(str2)) {
			System.out.println("값이 동일");
		}
		else
			System.out.println("값이 다르다");
	
	//-----------------------------------------------------
	
		String str3 = new String("Java");	
		String str4 = new String("Java");
	
		if(str3 == str4) {
			System.out.println("주소동일");
		}
		else
			System.out.println("주소동일하지 않음");
	
		
		if(str3.equals(str4)) {
			System.out.println("값이 동일");
		}
		else
			System.out.println("값이 다르다");
	}

}
