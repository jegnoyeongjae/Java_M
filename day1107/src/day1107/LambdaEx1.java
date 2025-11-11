package day1107;

// 람다식을 이용하지 않은 일반적인 클래스의 메서드
class MaxTest {
	int max(int a, int b) {
		return a > b ? a : b;
	}
}

// 1. 람다식을 사용하기 위한 함수형 인터페이스
// 3. 람다식용 인터페이스임을 나타내기 위해 어노테이션 추가, 람다식을 위해 생성된 인터페이스는(함수형 인터페이스 = @FunctionalInterface) 단 하나의 메서드만을 가질 수 있다.
@FunctionalInterface
interface LMaxTest {
	// 2. 추상 메서드 생성 (람다에서 사용할 이름을 생성)
	public abstract int max(int a, int b);
}

public class LambdaEx1 {
	public static void main(String[] args) {
		/*
		 * MaxTest m1 = new MaxTest();
		 * 
		 * int res1 = m1.max(54, 140);
		 * 
		 * System.out.println(res1);
		 */
		Object mt = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;

			}
		};
		// System.out.println(mt.max(5,2)); //The method max(int, int) is undefined for
		// the type Object

		// 4. 함수형 인터페이스 타입으로 익명 객체 생성
		LMaxTest mt2 = new LMaxTest() {
			// 5. public 추가 / 오버라이딩 규칙(접근제어자는 좁은 범위를 사용할수 없다)
			public int max(int a, int b) {
				return a > b ? a : b;

			}
		};

		LMaxTest mt3 = (a, b) -> a > b ? a : b; // The target type of this expression must be a functional interface
		
		System.out.println(mt3.max(30, 120));

	}
}
