package kdata.while_test;

public class While_Test {
	public static void main(String[] args) {

		// 1~10까지의 합 while문, 증감식 i = i+1 쓸때(o)
		int sum1 = 0;
		int i1 = 1;
		while (i1 <= 10) {
			sum1 = sum1 + i1;
			i1 = i1 + 1;
			System.out.println(sum1);
			System.out.println();
		}
		
		// 1~10까지의 합 while문, 증감식 i = i+1 안쓸때(x)
		int sum2 = 0;
		int i2 = 1;
		while (i2 <= 10) {
			sum2 = sum2 + i2;
			System.out.println(sum2);
			System.out.println();
		}
		
		// 변수를 밖에 쓸때 for문
		int j = 1;
		for (; j <= 10; j++) {
			System.out.println("hello " + j + "번 출력");
		}
	}

}
