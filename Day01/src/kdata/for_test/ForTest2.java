package kdata.for_test;

public class ForTest2 {
	public static void main(String[] args) {

		// 1~10������ ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			if (i == 10) {
				System.out.println("i�� : " + i);
				System.out.println("sum�� : " + sum);

			}
		}
		System.out.println();

		// 1~100���� ¦���� ��
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum = sum + i;
			}

			if (i == 100) {
				System.out.println("i�� : " + i);
				System.out.println("sum�� : " + sum);

			}
		}
		System.out.println();

		// 1~100���� 3�ǹ���� ��
		for (int i = 3; i <= 100; i = i + 3) {

			if (i % 3 == 0) {
				sum = sum + i;
			}
			
			if (i == 99) {
				System.out.println("i�� : " + i);
				System.out.println("sum�� : " + sum);
			}

		}
	}
}
