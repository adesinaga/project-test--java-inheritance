package isi;

import java.util.ArrayList;

public class Class {
	String kodekelas;
	String namakelas;
	static int studentCount = 0;
	ArrayList<Student> s = new ArrayList<Student>();
	Teacher t;
	Class(String kdkelas, String nmkelas ){
		kodekelas=kdkelas;
		namakelas=nmkelas;
		
	}
	
	public ArrayList<Student> getStudent() {
		return s;
	}
	public void setStudent(Student s) {
		this.s.add(s);
		studentCount++;
	}
	public Teacher getTeacher() {
		return t;
	}
	public void setTeacher(Teacher t) {
		this.t = t;
	}
	
	public String getKodekelas() {
		return kodekelas;
	}
	public void setKodekelas(String kodekelas) {
		this.kodekelas = kodekelas;
	}
	public String getNamakelas() {
		return namakelas;
	}
	public void setNamakelas(String namakelas) {
		this.namakelas = namakelas;
	}
	public static int getStudentCount() {
		return studentCount;
	}
	public static void setStudentCount(int studentCount) {
		Class.studentCount = studentCount;
	}
	
	
}
