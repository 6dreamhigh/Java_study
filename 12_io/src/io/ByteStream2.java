package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args)  {
		try {
			File file = new File("data.txt"); //객체에 대한 주소는 file이 갖고 있음
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int) file.length();//파일의 크기    //배열.length / 문자열.length()
			byte[] b = new byte[size];
			
			bis.read(b,0,size);//모든데이터가 b에 읽어들어옴
			bis.close();
//			System.out.println(b);//주소값 들어옴
			//byte[] ->String 변환
			System.out.println(new String(b));
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
