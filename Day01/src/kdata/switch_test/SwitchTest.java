package kdata.switch_test;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;

		switch (a % 2) {
		case 0:
			System.out.println(a + "��(��) ¦��");
			break;
		case 1:
			System.out.println(a + "��(��) Ȧ��");
			break;
		}

		// ���� switch�� -> 10���� ����
		int point = 82;

		switch (point / 10) {
		case 10: // System.out.println("A");
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
	}

}
