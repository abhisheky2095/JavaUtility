package com.java.util.SimpleJavautility;

import java.util.ArrayList;
import java.util.Arrays;



/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

class AddSum {

	public static void main(String args[]) {
		System.out.println(Arrays.toString(twoSum(new int[] {3, 4, 11, 5}, 9)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int [] result=null;
		
		int y=0;
		for (int i=0; i<nums.length; i ++){
			// System.out.println(nums[i]);
			y = target-nums[i];

			System.out.println(y);
			//System.out.println(Arrays.asList(nums).contains(x));
			boolean contains = check(nums, y);
			if(contains && (target==y+nums[i])) {

				System.out.println("Position : "+findIndex(nums, y));
				y=findIndex(nums, y);
				if (i!=y){
					result= new int[] {i, y };
					break;
				}
			}
			// boolean contains = IntStream.of(nums).anyMatch(x -> x == y);
			System.out.println(contains);




		}
		return  result;
	}
	private static Boolean check(int[] arr, int toCheckValue)
	{
		// check if the specified element
		// is present in the array or not
		// using Linear Search method
		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}

		// Print the result
		System.out.println("Is " + toCheckValue
				+ " present in the array: " + test);
		return test;
	}
	public static int findIndex(int arr[], int t)
	{
		// Creating ArrayList
		ArrayList<Integer> clist = new ArrayList<>();

		// adding elements of array
		// to ArrayList
		for (int i : arr)
			clist.add(i);

		// returning index of the element
		return clist.indexOf(t);
	}
}