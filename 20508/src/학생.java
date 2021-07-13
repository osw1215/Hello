
public class 학생 {

	학생() {
		count++;	
	}
	
	static int count = 0;
	final static String school = "ROBOT";
	String name;
	int grade;
	
	
	void print() {
		System.out.println(count + "번째" + school + name + ":" + grade + "학년");
		
	}
}
