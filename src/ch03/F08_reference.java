package ch03;

public class F08_reference {
	/*
	 * 	레퍼런스 변수: 주소 참조 변수
	 * 		배열,객체,인터페이스 객체
	 */
	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
			arr[i]=i;
		int arr2[];
		arr2=arr;
		arr2[5]=100;
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}