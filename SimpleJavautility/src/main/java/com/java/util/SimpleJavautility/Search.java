package com.java.util.SimpleJavautility;

/*
 * Binary Search vs Linear Search for Sorted Array
 */
class Search{  
	public static void binarySearch(int arr[], int first, int last, int key){  
		int mid = (first + last)/2;  
		while( first <= last ){  
			if ( arr[mid] < key ){  
				first = mid + 1;     
			}else if ( arr[mid] == key ){  
				System.out.println("Element is found at index: " + mid);  
				break;  
			}else{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  
		if ( first > last ){  
			System.out.println("Element is not found!");  
		}  
	}  

	public static void linearSearch(int arr[], int key){  
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("Element is found at index: " + i);
				break;
			}
		}
	} 
	public static void main(String args[]){  
		int arr[] = {10,20,30,40,50,55,56,78};  
		int key = 78;  
		int last=arr.length-1; 
		long time = System.currentTimeMillis();
		binarySearch(arr,0,last,key);  
		long final_time = System.currentTimeMillis()-time;
		System.out.println("Final time : "+final_time);
		
		long time1 = System.currentTimeMillis();
		linearSearch(arr,key);  
		long final_time1 = System.currentTimeMillis()-time1;
		System.out.println("Final time : "+final_time1);
		
	}  
}  