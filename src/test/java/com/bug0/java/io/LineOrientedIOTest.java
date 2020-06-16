package com.bug0.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineOrientedIOTest {

	public static void main(String[] args) throws IOException{
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader("./src/test/io/xanadu.txt"));
			out = new PrintWriter(new FileWriter("./src/test/io/cs_test.txt"));
			String line;
			while (true) {
				line = in.readLine();
				System.out.println(line);
				if (line == null) {
					break;
				}
				out.println(line);
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
