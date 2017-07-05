package dahoon.test;

public class Student implements Comparable<Student>{
	private String num;
	private String name;
	private String address;
	private String phoneNum;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String num, String name,String address, String phoneNum,int kor,int eng, int math) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal(){
		return this.kor + this.eng + this.math;
	} //총점 구하는 함수 
	
	public double getAverage(){
		return getTotal()/3.0;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return name + " " + num + " " +  address + " " + phoneNum + " " + kor + " " + eng + " " + math + " " + getTotal() + " " + getAverage();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
}