package day1028;

class value{
	int value;

	public value(int v) {
		this.value = v;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 1. 현재 객체와 매개변수로 받은 객체를 비교 return this == obj;
		
		// 2. obj와 this 객체는 v값을 가지고 있지 않음 return this.value = obj.value
		
		// 3. obj는 비교할 대상의 부모이므로 비교할 값을 갖기 위해 value타입으로 형변환 한다.
		// value v = (value) obj;
		// return this.value == v.value;
		
		// 4. 참조 변수의 현변환을 할 때는 반드시 형변환이 가능한지 확인해야 하므로 instanceof를 사용해야한다.
		
		if(obj instanceof value) {
		value v = (value) obj;
		return this.value == v.value;
		}else {
			return false;
		}
	}
	
}

public class ObjEquals1 {
	public static void main(String[] args) {
		value v1 = new value(10);
		value v2 = new value(10);
		
		System.out.println(v1.equals(v2));
		
		v2 = v1;
		
		System.out.println(v1.equals(v2));
	}
}
