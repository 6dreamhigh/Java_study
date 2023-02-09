package class_;

public class Compute {
	private int x,y,sum,sub,mul;
	private double div;
	
	public void setData(int x, int y) {
		 this.x= x; //this.x = class ÇÊµå º¯¼ö
		 this.y = y;	
	}
	
	public void calc(){
		this.sum = this.x + this.y;
		sub = x-y;
		mul = x*y;
		div = x/y;
	}
	
	public int getX() {
		return this.x; //this´Â »ý·«°¡´É
	}
	
	public int getY() {
		return y;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getSub() {
		return sub;
	}
	
	public int getMul() {
		return mul;
	}
	
	public String getDiv() {
		return String.format("%.2f", div);
	}
}