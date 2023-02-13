package abstract_;

public class AbstractTest {
	private String name;
	
	public AbstractTest(String name) { //POJO (Plain Old Java Object)
		super();
		this.name = name;
	}

	//외부로부터 데이터를 주기 위해 생성자 혹은 setter를 사용해야 함
	//외부로부터 데이터를 꺼낼려면 getter를 사용해야 함
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		

	}
	

}
