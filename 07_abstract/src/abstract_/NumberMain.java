package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); //추상클래스이기에 생성 안됨
		
		//1. sub class 이용
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(12345678.45678));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.45678));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.45678));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//2.메소드 이용하여 생성*****
//		NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		//소수 이하 2째자리까지 표시
		nf4.setMaximumFractionDigits(2);//₩12,345,678.46
		nf4.setMinimumFractionDigits(2);//₩12,345,678.00
		System.out.println(nf4.format(12345678.45678));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
//		NumberFormat nf5 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		nf5.setMaximumFractionDigits(2);
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.45678));//$12,345,678.46
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		
		
	}

}
