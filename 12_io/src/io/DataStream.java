package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) {
		try {
			//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		
			FileOutputStream fos = new FileOutputStream("result.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(185.3);
			
			dos.close();
		}catch(FileNotFoundException e) {//IOException은 FileNotFoundException의 부모
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
/*
Application은 응용 프로그램
데이터가 들어오고 나가는 길을 스트림이라 한다.
byte 단위는 자바에서 처리 속도가 느리다. 
문자 단위 처리는 한글이 깨지지 않음
Reader 
Writer
-BufferedWriter 보다 PrintWriter를 더 많이 쓴다. 

BurreredOutputStream 은 byte단위로 처리 -한글은 깨짐->출력할 메소드가 2개밖에 안됨
DataOutputStream :  자료형별로 메소드가 존재함 
PrintStream :자료형별로 메소드가 존재함-가장 많이 쓰임 , Overload됨 
 System.out.print()
 System.out.println()   --> out의 자료형은 PrintStream이다. 

*/
