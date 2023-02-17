package member;

import java.io.Serializable;

public class MemberDTO implements Comparable<MemberDTO>, Serializable{
		private String name;
		private int age;
		private  String phone;
		private String address;
		public MemberDTO(String name, int age, String phone, String address) {
			super();
			this.name = name;
			this.age = age;
			this.phone = phone;
			this.address = address;
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		@Override
		public String toString() {
		
			return name+"\t"+age+"\t"+phone+"\t"+address;
		}
		@Override
		//Comparable 방법
		public int compareTo(MemberDTO m) {
			
			return this.name.compareTo(m.getName());
		
		}

}




/*
[문제] 회원관리

* 조건
- 회원을 입력받아서 파일에 저장하거나 파일의 내용을 읽어온다.
- MemberService 클래스에 메뉴 메소드 작성한다.
  메뉴에 따라 각각의 클래스를 작성한다.
- 회원의 정보는 이름, 나이, 핸드폰, 주소로 한다.

1. 클래스 작성
MemberMain.java

MemberService.java
- 메뉴 작성

MemberDTO.java
- 필드, 생성자, setter, getter

MemberInsert.java
MemberPrint.java
MemberPhoneSearch.java
MemberNameAsc.java
MemberFileInput.java
MemberFileOutput.java

2. 인터페이스 작성

Member.java
- 추상메소드 public void execute();


menu()
********************
  1. 등록
  2. 출력
  3. 핸드폰 검색
  4. 이름으로 오름차순
  5. 파일 저장
  6. 파일 읽기
  7. 끝
********************
  번호 : 

*/