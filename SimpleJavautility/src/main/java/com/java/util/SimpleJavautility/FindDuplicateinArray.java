package com.java.util.SimpleJavautility;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateinArray {
	
	/*
	 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	 */

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> temp_var = new HashSet<Integer>();
        boolean status = false;
        for (int i=0; i<nums.length; i++){
            if (temp_var.contains(nums[i])){
                status=true;
                break;
            }
            temp_var.add(nums[i]);
        }
        return status;
    }

    
    public static void main(String args[]) {
    	int [] nums  = {1, 2, 3, 1};
    	System.out.println(containsDuplicate(nums));
    }
}