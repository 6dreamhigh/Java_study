package abstract_;
//메뉴판의 역할
public abstract class AbstractTest {
	protected String name;
	
	public AbstractTest() {
		
	}
	public AbstractTest(String name) { //POJO (Plain Old Java Object)
		super();
		this.name = name;
	}

	//외부로부터 데이터를 주기 위해 생성자 혹은 setter를 사용해야 함
	//외부로부터 데이터를 꺼낼려면 getter를 사용해야 함
	public String getName() {
		return name;
	}
	public abstract void setName(String name);//추상메소드
	//**** 추상메소드가 있는 클래스는 반드시 추상클래스로 정의 되어야 한다.
//	public void setName(String name) {
//		this.name = name;
//	}

	public static void main(String[] args) {
		

	}
	

}
