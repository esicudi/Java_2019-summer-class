package ch07;

import java.util.Arrays;

public class F01_Array {
	/*
	 * 배열
	 * 
	 * 배열을 다루기 위한 클래스:Array
	 */
	public static void main(String[] args) {
		int arr[]= {1,4,2,7,8,6,5,9,0,3};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 5));
		int arr2[]=Arrays.copyOf(arr, arr.length+5);
		System.out.println(Arrays.toString(arr2));
	}
}
