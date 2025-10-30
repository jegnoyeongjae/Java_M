package day1028;

class Member {
	String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Member))  // 참조 변수의 참조 타입을 비교하는 연산자 왼쪽이 변수 오른쪽이 비교하교픈 타입이 위치한다. 해당 코드는 !로 instanceof를 한번 더 감싸 
			return false; 
		
		Member m = (Member) obj;
		return this.id == m.id;
		
		
	}
}

public class ObjEquals2 {
	public static void main(String[] args) {
		Member m1  = new Member("red");
		Member m2  = new Member("blue");
		Member m3  = new Member("green");
		
	}
	
}
