package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
//	public static void main(String[] args) throws IOException {
	public static void main(String[] args)  {
		try {
			//파일 출력
			//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			FileOutputStream fos = new FileOutputStream("result.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(185.3);
			
			dos.close();
			
			//파일 읽기
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			String name = dis.readUTF(); //파일을 읽어와 name에 보관한다.
			int age = dis.readInt();
//			float height = dis.readFloat();//데이터형이 달라 깨져버림
			double height = dis.readDouble();
			System.out.println("이름 = "+name);
			System.out.println("나이 = "+age);
			System.out.println("키 = "+height);
			
			dis.close();
//			FileInputStream fos2 = new FileInputStream("result.txt");
//			DataInputStream dos2 = new DataInputStream(fos2);
			
			
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
