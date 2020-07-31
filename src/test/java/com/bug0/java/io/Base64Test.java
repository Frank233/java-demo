package com.bug0.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.util.Base64Utils;

public class Base64Test {

	public static void main(String[] args) {
		pdfToBase64();
	}

	public static void base64ToPdf() {
		
	}
	
	public static void pdfToBase64() {
		// pdf to byte[]
		FileInputStream in = null;
		BufferedInputStream bin = null;
		ByteArrayOutputStream out = null;
		BufferedOutputStream bout = null;
		try {
			in = new FileInputStream("./src/test/io/test1.pdf");
			bin = new BufferedInputStream(in);
			out = new ByteArrayOutputStream();
			bout = new BufferedOutputStream(out);
			byte[] b = new byte[1024];
			int len = bin.read(b);
			System.out.println("len=");
			System.out.println(len);
			System.out.println("b=");
			System.out.println(b.toString());
			while (len > 0) {
				bout.write(b, 0, len);
				len = bin.read(b);
				System.out.println("len=");
				System.out.println(len);
				System.out.println("b=");
				System.out.println(b.toString());
			}
			bout.flush();
			byte[] result = out.toByteArray();
			
			// encode
			String encodedStr = Base64Utils.encodeToString(result);
			System.out.println(encodedStr.length());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != bin) {
				try {
					bin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != bout) {
				try {
					bout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
