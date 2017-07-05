package dahoon.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class StudentManager {
	private List<Student> studentList;
	
	public StudentManager(){
		studentList = new ArrayList<>();
	}
	
	public void add(String num, String name,String address,String phoneNum,int kor, int eng, int math){
		studentList.add(new Student(num, name,address,phoneNum,kor,eng,math));
	}
	
	public void print(){
		Collections.sort(studentList);
		for(Student s : studentList){
			System.out.println(s.toString());
		}
		System.out.println("�Էµ� ���� �����ϴ�.");
	}
	
	public String search(String name){
		for(int i=0;i<studentList.size();i++){
			if(studentList.get(i).getName().equals(name)){
				return studentList.get(i).toString();
			}
		}
		return null;
	}
	
	public String delete(String name){
		
//		for(Student s : studentList){
//			if(s.getName().equals(name)){
//				String returnName = s.getName();
//				studentList.remove(s);
//				return returnName+"�� ������ �����Ǿ����ϴ�.";
//			}
//		}
		for(int i=0;i<studentList.size();i++){
			if(studentList.get(i).getName().equals(name)){
				String returnName = studentList.get(i).getName();
				studentList.remove(i);
				return returnName+"�� ������ �����Ǿ����ϴ�.";
			}
		}
		return "�Էµ� ������ �����ϴ�.";
	}
	
	public String getAllTotal(){
		Iterator<Student> it = studentList.iterator();
		int sum = 0;
		
		while(it.hasNext()){
			Student s = it.next();
			sum +=s.getTotal();
		}
		return "��ü ���� : " + sum;
	}
	
	public String getMaxTotal(){
		int max = 0;
		for(int i=1;i<studentList.size();i++){
			if(studentList.get(i-1).getTotal()<=studentList.get(i).getTotal()){
				max=studentList.get(i).getTotal();
			}else{
				max=studentList.get(i-1).getTotal();
			}
		}
		return "�ְ� ���� : "+max;
	}
	
	public String getMinTotal(){
		int min=0;
		for(int i=1;i<studentList.size();i++){
			if(studentList.get(i-1).getTotal() <= studentList.get(i).getTotal()){
				min = studentList.get(i-1).getTotal();
			}else{
				min = studentList.get(i).getTotal();
			}
		}
		return "���� ���� : "+min;
	}
	
}
