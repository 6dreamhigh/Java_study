package nested;

public class AbstractMain {
	

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {//클래스 - 클래스 이름이 없음 -익명 inner클래스
			public void setName(String name) {
				this.name = name;
			}
		};
		InterA in = new InterA() {
			public void aa() {}
			public void bb() {}
		};//인터페이스를 쓰기 위해 키다리 아저씨를 new 시킨 것 - 인터페이스 new한 것이 아님 주의!! 
	}
	AbstractExam ae = new AbstractExam() {
		//원하는 메소드를 overriding.. 두끼떡볶이처럼 
		
	};

}
