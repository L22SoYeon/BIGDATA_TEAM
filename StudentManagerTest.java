package dahoon.test;
import java.util.Scanner;

public class StudentManagerTest {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.학생정보 저장
		// 2.학생리스트 이름으로 오름차순 정렬
		// 3.검색
		// 4.삭제
		// 5.전체 총점
		// 6.최고 점수 max
		// 7.최저 점수 min
		// 8.종료 
		StudentManager studentManager = new StudentManager();

		while (true) {
			String inputs = "";
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생 리스트 출력");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.전체 총점");
			System.out.println("6.최고 점수");
			System.out.println("7.최저 점수");
			System.out.println("8.종료");
			System.out.print("번호를 입력하세요 : ");
			
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
				
				System.out.print("학번 : ");
				num = numberException();
				System.out.print("이름 : ");
				name = input.nextLine();
				System.out.print("주소 : ");
				address = input.nextLine();
				System.out.print("폰 번호 : ");
				phoneNum = numberException();
				System.out.println("국어 점수 : ");
				korScore = numberException();
				System.out.println("영어 점수 : ");
				engScore = numberException();
				System.out.println("수학 점수 : ");
				mathScore = numberException();
				
				studentManager.add(num, name,address,phoneNum,Integer.parseInt(korScore),Integer.parseInt(engScore),Integer.parseInt(mathScore));
				break;
			case "2":
				System.out.println("이름	학번	주소	전화번호	국어	영어	수학	총점	평균");
				studentManager.print();
				break;
			case "3":
				String searchName="";
				System.out.print("검색할 학생의 이름을 입력하시오 : ");
				searchName = input.nextLine();
				System.out.println("이름	학번	주소	전화번호	국어	영어	수학	총점	평균");
				System.out.println(studentManager.search(searchName));
				break;
			case "4":
				String deleteName = "";
				System.out.print("삭제할 학생 이름을 입력하시오 : ");
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
				System.out.println("프로그램을 종료합니다.");
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
				System.out.println("숫자만 입력하세요");
				System.out.print(" : ");
				continue;
			}
		}
	}

}
