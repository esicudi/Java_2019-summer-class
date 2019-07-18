package Ch03;

public class F11_foreach {
	/*
	 * 	반복문의 한 형태
	 * 	순차탐색에 용이
	 * 	인덱스 사용불가
	 * 
	 * 	for(자료형 변수이름:배열){
	 * 
	 * 	}
	 */
	public static void main(String[] args) {
		int intArr[]= {15,7,6,2,4,-5,9,-7,2};
		int sum=0;
		for(int num:intArr) {
			if(num>0) sum+=num;
		}
		System.out.println(sum);
	}

}
