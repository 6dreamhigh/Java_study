package interface_;

public interface InterC extends InterA , InterB{

	//인터페이스는 다중 상속이 됨, 단 자바의 클래스는 다중 상속 불가
	//인터페이스 메소드들은 반드시 default 아니면 public 만 가능
	public default void aa() {
				
	}
	
	public default void bb() {
				
	}
	
	public default void cc() {};
	
	public default void dd() {};	
}
		
/*
클래스 b extends 클래스 a (0)
extends는 앞뒤 형태 동일해야함 클래스면 클래스 
오버라이드 할려면 반드시 앞에 클래스가 와야 됨 6번
*/