
public class Day03_¹Ýº¹¹®_foreach {

	public static void main(String[] args) {
		int a[] = new int[] {1,2,3,4,5};
		
		for(int i : a)
			System.out.println(i);

		float b[] = new float[] {2.1f, 3.3f, 4.1f};
		float sum = 0;
		for(float val : b) {
			System.out.println(val);
			sum += val;
		}
		System.out.println("SUM:" + sum);
		
		
		
		String []c = {"SEOUL", "ROBOT", "HIGH", "SCHOOL"};
		for(String str : c)
			System.out.print(str);
		
	}

}
