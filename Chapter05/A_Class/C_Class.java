package Chapter05.A_Class;

//객체(Object): 우리 실생활에 존재하는 모든 것
//	상태를 표현할 수 있고 우리가 행동으로 실행할 수 있는 모든 것

public class C_Class {

	public static void main(String[] args) {
		// 클래스(Class)
		// 객체를 정의하는 틀 또는 설계도
		
		// 클래스의 구성
		// 객체의 상태를 나타내는 필드 & 객체의 행동을 나타내는 메서드
		// 필드: 클래스에 포함된 변수 또는 상수
		// 메서드: 어떠한 특정 작업을 수행하기 위한 명령문의 집합
		
		// 같은 클래스로 생성된 객체라도 각각이 가지고 있는 '속성 값'은 다르다.
		
		// 클래스 선언 방법
//		접근제한자 class 클래스명 {
//			// 필드
//			// 메서드
//		}
		
		// 1. 접근제한자: public, private, protected 또는 default값이 들어 올 수 있다.
		// 2. class: 클래스를 선언하는 키워드
		// 3. 클래스명: 클래스명은 관례에 따라 대문자로 시작한다.
		// 4. 필드: 클래스의 속성을 정의하는 변수
		// 5. 메서드: 클래스의 동작을 정의하는 함수
		
		// 클래스의 속성(변수, 특성, 필드, 상태)
		
		// 해당 클래스의 객체가 가질 수 있는 정보나 상태를 정의
		// 필드는 변수와 같은 역할이지만, 클래스 내부에 선언되어 클래스의 모든 인스턴스
		// 즉, 객체에서 공유되거나 개별적으로 값을 가질 수 있다.
		
		// 클래스의 필드 유형
		// 1. 인스턴스 변수: 각 객체 인스턴스가 자체 복사본을 가지는 변수
		//				클래스에 직접 속하며, 객체가 생성될 때마다 메모리가 할당
		// 2. 클래스 변수: 클래스의 모든 인스턴스가 공유하는 변수, static 키워드를 사용하여 선언
		//				클래스 로드 시점에 한 번만 메모리가 할당
		// 3. 지역 변수: 메소드 또는 생성자 내에서 선언, 해당 메소드 또는 생성자 내에서만 접근할 수 있다.		
		
		// 클래스의 메서드(기능, 함수, 행위)
		
		// 해당 클래스가 수행할 수 있는 작업을 정의하는데 사용
		// 어떤 해동을 나타내며, 클래스의 객체를 통해 호출
		
		// 메서드 선언 방법
//		접근제한자 반환타입 메서드명(매개변수) {
//			// 메서드 문구
//		}
		
		// 1. 접근제한자: 클래스의 접근제한자와 동일
		// 2. 반환타입: 메소드가 반환하는 값의 타입, 반환값이 없는 경우(void 라는 키워드 사용)
		// 3. 매개변수(parameter): 메소드가 받아들이는 입력값, 선택사항(없을 수 있다.)
		
		// 매개변수의 유효성 검사
		// 매개변수가 적절한 값으로 입력 되었는지 확인하는 작업이 항상! 먼저 이루어져야 한다.
		// 적절한 값이 오지 않을 경우와, 적절한 값이 왔을 경우를 모두 대비하여 프로그램 작성
		
		// 클래스: 사용자 정의 데이터타입 또는 메서드의 집합
		
		// 클래스
		// 클래스명은 UpperCamelCase 명명 규칙을 따름

	}
}
