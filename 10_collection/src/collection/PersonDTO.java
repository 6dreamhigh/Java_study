package collection;

public class PersonDTO implements Comparable<PersonDTO>{//1인분
	private String name;
	private int age;
	
	public  PersonDTO(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
		public String toString() {
			
			return name +"\t"+age;
		}
	@Override
	public int compareTo(PersonDTO dto) {
		//age로 오름차순
		if(this.age < dto.age) return -1; //오른쪽이 더 큰 경우 -1 리턴
		else if(this.age > dto.age) return 1;
		else return 0;
	}

	//기본 정렬기준 외에 다른 기준으로 정렬할 시 Comperator사용
	
}















