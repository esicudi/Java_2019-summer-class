package ch03;

public class F14_methodArray {
	/*
	 * 	메소드(함수)와 배열간의 과계
	 * 	배열->레퍼러스 변수
	 */
	public static void changeArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
	}
	public static int[] createArray(int size) {
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=i+1;
		return arr;
	}
	public static void main(String[] args) {
		int[] intArr=new int[10];
		System.out.println("메소드 호출 전");
		for(int num:intArr)
			System.out.println(num);
		changeArray(intArr);
		System.out.println("메소드 호출 후");
		for(int num:intArr)
			System.out.println(num);
		int intArr2[]=createArray(20);
		for(int num:intArr2)
			System.out.println(num);
	}

}
