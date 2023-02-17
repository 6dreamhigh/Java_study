package io;

import java.io.Serializable;

public class PersonDTO implements Serializable{//데이터를 클래스로 묶음 
	//객체 직렬화 - 객체는 파일이나 네트워크로 전송안돼 byte[] 변환시켜 전송 Serializable :추상메소드가 없음
	
	private String name;
	private int age;
	private double height;
	public PersonDTO(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
