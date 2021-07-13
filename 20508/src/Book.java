public class Book {

	
	//생성자
	Book(String name, int count){
		bookName = name;
		this.count = count;
	}
	
	
	//멤버 변수 - 책이름,재고량
	String bookName;
	private int count;
	
	
	//메소드
	// 지금 등록한 책의 이름과 재고량 출력하는 메소드
	void printBookCount() {
		System.out.println(bookName + ":" + count + "권 재고 있음");
	}
	
	//책을 count 수 만큼 대출하는 메소드
	void rentalBook(int count) {
		if(count > this.count) {
			System.out.println(bookName + " 재고량부족," + " 현재재고량:" + this.count);
		}
		else {
			this.count = this.count - count;
			System.out.println(bookName + ":" + count + "대출");
			printBookCount();
		}
	}
	
	//책을 반납하는 메소드
	void returnBook(int count) {
		this.count += count;
		System.out.println(bookName + ":" + count + "권 반납, " + this.count + "권 재고 있음");
	}
}
