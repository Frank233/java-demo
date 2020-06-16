package com.bug0.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamsTest {

	public static void main(String[] args) throws IOException{

		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			// absolute path
//			in = new FileInputStream("E:\\yzm\\sts_workspace\\java-tutorial\\java-demo\\src\\test\\io\\xanadu.txt");
			// relative path
			in = new FileInputStream(".\\src\\test\\io\\xanadu.txt");
			out = new FileOutputStream(".\\src\\test\\io\\outtest.txt");
			int c;
			while (true) {
				try {
					c = in.read();
					System.out.println(c);
					if (c == -1) {
						break;
					}
					out.write(c);
				} catch (IOException e) {
					System.out.println("IOException");
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException");
		} finally {
			if (null != in) {
				in.close();
			}
			if (null != out) {
				out.close();
			}
		}
	}

}
