package kdata.if_test;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언+초기화
		int a = 0;

		// 조건 2개가 서로 배타적일때(양수,0,음수) ->if~else사용
		{
			if (a > 0)
				System.out.println(a + "은(는) 양수");

			else if (a == 0)
				System.out.println(a + "은(는) 0");

			else
				System.out.println(a + "은(는) 음수");
		}

		// 조건 2개가 서로 배타적이지 않을때(양수,짝수) -> if~if사용

		// a가 짝수일때, 홀수일때
		{
			if (a % 2 == 0)
				System.out.println(a + "은(는) 짝수");
			else
				System.out.println(a + "은(는) 홀수");
		}

	}

}
