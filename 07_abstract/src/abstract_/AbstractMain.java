package abstract_;

public  class AbstractMain extends AbstractTest {
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractMain();
		//기본 생성자는 생성자가 하나도 없을 경우 자동으로 생성한다.
		at.setName("홍길동");
		System.out.println(at.getName());

	}

}
