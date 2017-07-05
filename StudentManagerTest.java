package dahoon.test;
import java.util.Scanner;

public class StudentManagerTest {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.�л����� ����
		// 2.�л�����Ʈ �̸����� �������� ����
		// 3.�˻�
		// 4.����
		// 5.��ü ����
		// 6.�ְ� ���� max
		// 7.���� ���� min
		// 8.���� 
		StudentManager studentManager = new StudentManager();

		while (true) {
			String inputs = "";
			System.out.println("1.�л����� �߰�");
			System.out.println("2.�л� ����Ʈ ���");
			System.out.println("3.�л� ���� �˻�");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.��ü ����");
			System.out.println("6.�ְ� ����");
			System.out.println("7.���� ����");
			System.out.println("8.����");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			
			inputs = numberException();
			
			switch(inputs){
			case "1":
				String num = "";
				String name = "";
				String address="";
				String phoneNum="";
				String korScore="";
				String engScore="";
				String mathScore="";
				
				System.out.print("�й� : ");
				num = numberException();
				System.out.print("�̸� : ");
				name = input.nextLine();
				System.out.print("�ּ� : ");
				address = input.nextLine();
				System.out.print("�� ��ȣ : ");
				phoneNum = numberException();
				System.out.println("���� ���� : ");
				korScore = numberException();
				System.out.println("���� ���� : ");
				engScore = numberException();
				System.out.println("���� ���� : ");
				mathScore = numberException();
				
				studentManager.add(num, name,address,phoneNum,Integer.parseInt(korScore),Integer.parseInt(engScore),Integer.parseInt(mathScore));
				break;
			case "2":
				System.out.println("�̸�	�й�	�ּ�	��ȭ��ȣ	����	����	����	����	���");
				studentManager.print();
				break;
			case "3":
				String searchName="";
				System.out.print("�˻��� �л��� �̸��� �Է��Ͻÿ� : ");
				searchName = input.nextLine();
				System.out.println("�̸�	�й�	�ּ�	��ȭ��ȣ	����	����	����	����	���");
				System.out.println(studentManager.search(searchName));
				break;
			case "4":
				String deleteName = "";
				System.out.print("������ �л� �̸��� �Է��Ͻÿ� : ");
				deleteName = input.nextLine();
				System.out.println(studentManager.delete(deleteName));
				break;
			case "5":
				System.out.println(studentManager.getAllTotal());
				break;
			case "6":
				System.out.println(studentManager.getMaxTotal());
				break;
			case "7":
				System.out.println(studentManager.getMinTotal());
				break;
			case "8":
				System.out.println("���α׷��� �����մϴ�.");
				input.close();
				System.exit(0);
				break;
			}
		}
	}
	public static String numberException(){
		while(true){
			String name = input.nextLine();
			try{
				Integer.parseInt(name);
				return name;
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �Է��ϼ���");
				System.out.print(" : ");
				continue;
			}
		}
	}

}
