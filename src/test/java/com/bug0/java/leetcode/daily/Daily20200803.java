package com.bug0.java.leetcode.daily;

public class Daily20200803 {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(addStrings("888","44"));
	}
	
	// 暴力法
	public static String addStrings(String num1, String num2) {
		int length = num1.length();
		if (length < num2.length()) {
			length = num2.length();
		}
		char[] array1 = num1.toCharArray();
		char[] array2 = num2.toCharArray();
		StringBuilder sb = new StringBuilder();
		int result = 0;
		boolean count = false;
		for (int i = num1.length() - 1, j = num2.length() - 1; i > -1 || j > -1; i--,j--) {
			result = 0;
			if (i > -1) {
				result = result + Integer.valueOf(String.valueOf(array1[i]));
			}
			if (j > -1) {
				result = result + Integer.valueOf(String.valueOf(array2[j]));
			}
			if (count) {
				result = result + 1;
				count = false;
			}
			if (result > 9) {
				result = result - 10;
				count = true;
			}
			sb.insert(0, result);
		}
		if(count) {
			sb.insert(0, 1);
		}
		return sb.toString();
    }
}
