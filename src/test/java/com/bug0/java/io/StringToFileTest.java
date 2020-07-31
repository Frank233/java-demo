package com.bug0.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

public class StringToFileTest {

	public static void main(String[] args) {
		String str = "this is a string";
		StringReader in = new StringReader(str);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("./src/test/io/StringToFileTestOut.txt");
			int c = in.read();
			while (c != -1) {
				out.write(c);
				System.out.println(c);
				c = in.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			in.close();
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
