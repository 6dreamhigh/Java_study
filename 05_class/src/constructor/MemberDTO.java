package constructor;
//MemberVO ->Value Object
public class MemberDTO {//1인분 /DTO :DATA TRANSER OBJECT 데이터를 묶어서 가지고 다님
	
	private String name;
	private int age;
	private String phone;
	private String address;
// 생성자를 통해서 데이터 4개를 받아온다. 
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	//getter로 받기
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	//데이터 값을 바꿀때
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
