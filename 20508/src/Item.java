
public class Item {
	//멤버변수
	private String no;    // 이 문제에서 no는 100,101,102등의 상품 코드이므로 String , int 모두 가능합니다.
	private String name;
	private int price;
	private int count;
	private static final String COMPANY="놀러와 회사";
	private static int itemCnt;
	
	//생성자 3가지
	Item(){
		itemCnt++;
	}
	Item(String no , String name){
		this();
		this.no =no ;
		this.name = name;
	}
	Item(String no , String name, int price, int count){
		this(no,name);
		this.price = price;
		this.count = count;
	}
	
	//getter , setter
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getItemCnt() {
		return itemCnt;
	}
	public static void setItemCnt(int itemCnt) {
		Item.itemCnt = itemCnt;
	}
	public static String getCompany() {
		return COMPANY;
	}
	
	// 추가 메소드
	void inStore(int count) {
		System.out.println("입고: " + this.name + "," + count + "개");
		this.count += count ; //this.count = this.count + count
	}
	
	void outStore(int count) {
		if( count > this.count) {
			System.out.println( count + "출고실패 :" + name + "의 현재재고" + this.count);
		}else {
			System.out.println("출고: " + this.name + "," + count + "개");
			this.count -= count;
		}
	}
	
	void toPrint() {
		System.out.println("상품코드:" + no + " 상품명:" + name + " 가격:" + price + " 재고:" + count);
	}
}










