package com.java.util.SimpleJavautility;

public class Reverse {
 /*
  * Given a signed 32-bit integer x, return x with its digits reversed. 
  * If reversing x causes the value to go outside the signed 32-bit integer range [-2147483648, 2147483647], then return 0.
  */

	public static int reverse(int x) {
		long temp_rev_num = 0; 
		int rev_num =0;
		if(x < 2147483647 && x >= -2147483648){
			while (x != 0 ) {
				temp_rev_num = temp_rev_num * 10 + x % 10;
				x = x / 10;
			}
			// System.out.println("Reverse number : "+temp_rev_num);
		}
		if(temp_rev_num < 2147483647 &&  temp_rev_num >= -2147483648)
			rev_num = (int) (long) (temp_rev_num);
		else rev_num =0;
		return rev_num;
	}
	
	
	public static void main(String args[]) {
		System.out.println(reverse(4589));
	}
	

}