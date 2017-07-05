package kdata.for_test;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문으로 hello 5번출력
		for (int i = 0; i <= 9; i++) {
			System.out.println("hello " + i + "번 출력");
			// i변수를 출력할때는 i값 중요
			// 반복횟수만 중요할때는 초기값 i가 어떤것이던 상관없음, 어떻게 증가하던 상관없음, 반복횟수만 확인
		}
		System.out.println();
		
		// 변수를 밖에 쓸때 for문
		int j = 1;
		for (; j <= 5; j++) {
			System.out.println("hello " + j + "번 출력");
		}

	}

}
