package sungJuk;

public class SungJukDTO {  //1인분

		private int no;
		private  String name;
		private  int kor;
		private  int eng;
		private  int math;
		private  int tot;
		private  double avg;
		public SungJukDTO(int no, String name, int kor,int eng,int math){
			this.no = no;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public void calc() {
			tot = kor+eng+math;
			avg = tot/3.0;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public int getTot() {
			return tot;
		}

		public void setTot(int tot) {
			this.tot = tot;
		}

		public double getAvg() {
			return avg;
		}

		public void setAvg(double avg) {
			this.avg = avg;
		}
		//SungJukList 3번째 방법 
		@Override
			public String toString() {
				return no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
			}

}


//ArrayList는 배열처럼 잡혀있으며, 넣고 빼는 것이 자유로움