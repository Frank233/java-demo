package com.bug0.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamsTest {

	public static void main(String[] args) throws IOException{
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("./src/test/io/xanadu.txt");
			out = new FileWriter("./src/test/io/cs_test.txt");
			int c;
			while (true) {
				c = in.read();
				System.out.println(c);
				if (c == -1) {
					break;
				}
				out.write(c);
			}
		} catch (Exception e) {
			System.out.println("Exception");
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
