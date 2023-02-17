package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		int data;
		while( (data = bis.read()) != -1){//마지막에 더이상 읽을거리가 없을 경우 -1을 반환함  /객체는 null반환
//			System.out.print((data));
//			//엔터도 같이 입력됨 - 1. 다음줄: \n 2. 맨 앞:\r ->1310 두가지 동작이 일어남
			System.out.print((char)data);
		}System.out.println();
	}
}
