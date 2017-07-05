package kdata.test;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수의 선언 , a라는 이름의 정수형 값을 저장
		int a;
		
		//a메모리에 10대입
		a = 10;
		
		//a메모리에 있는 값 확인(x)
		System.out.println("a");
		
		//a메모리에 있는 값 확인(o)
		System.out.println(a);
		
		//연결연산자 사용
		System.out.println("a = "  + a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		int c;
		c = a+b;
		System.out.println(a + " + " + b + " = " + c);
		
		char ch;
		//문자는 ''사용 -> 기본자료형 char
		//문자열은 ""사용 -> 참조자료형 String 배열
		ch = 'A';
		ch = '가';
		System.out.println(ch);
		
	}

}
