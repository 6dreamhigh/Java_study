package interface_;

public class ComputeMain {

	public static void main(String[] args) {
		//menu 함수 호출
		ComputeService computeService = new ComputeService();
		computeService.menu();
		System.out.println("프로그램 종료합니다.");

	}

}
