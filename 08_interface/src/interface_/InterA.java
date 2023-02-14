package interface_;

public interface InterA {
	//상수만 옴
	public static final String NAME = "홍길동";
	int AGE = 25;// public static final이 생략되어 있음
	//추상 메소드만 옴
	public abstract void aa();
//	public void aa(); //여기에 올 수 있는 것은 추상뿐이므로 abstract 빼도됨
	public void bb();
}
