package kdata.if_test;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����+�ʱ�ȭ
		int a = 0;

		// ���� 2���� ���� ��Ÿ���϶�(���,0,����) ->if~else���
		{
			if (a > 0)
				System.out.println(a + "��(��) ���");

			else if (a == 0)
				System.out.println(a + "��(��) 0");

			else
				System.out.println(a + "��(��) ����");
		}

		// ���� 2���� ���� ��Ÿ������ ������(���,¦��) -> if~if���

		// a�� ¦���϶�, Ȧ���϶�
		{
			if (a % 2 == 0)
				System.out.println(a + "��(��) ¦��");
			else
				System.out.println(a + "��(��) Ȧ��");
		}

	}

}
