package for_;

public class For03 {

	public static void main(String[] args) {
		int i ,sum = 0;
		int mul = 1;
		i = 1;
		for(i=1;i<11;i++) {
			sum+=i;
			mul*=i;
			System.out.println(i+"\t"+sum+"\t"+mul);
		}
	}

} 