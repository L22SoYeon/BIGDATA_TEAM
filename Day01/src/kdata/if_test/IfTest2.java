package kdata.if_test;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = 10;
		b = 20;

		if (a > b) {
			System.out.println(a + "가(이) " + b + "보다 크다");
		} else if (a < b) {
			System.out.println(b + "가(이) " + a + "보다 크다");
		} else
			System.out.println(a + "과(와) " + b + "는 같다");
	}

}
