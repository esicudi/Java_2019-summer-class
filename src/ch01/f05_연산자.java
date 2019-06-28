package ch01;

/*
 *  형 변환(타입변환): 데이터 변수형 변환
 * 		자동 형 변환: 컴파일러
 * 			작은타입에서 큰 타입으로 변환
 * 		강제 형 변환: 개발자
 * 			큰 타입에서 작은타입으로 변환
 * 			변수, 데이터 앞에 (데이터 타입) 작성
 * 			double->int: 소수점만 없어짐
 * 
 * 	연산자
 * 		
 */

public class f05_연산자 {

	public static void main(String[] args) {
		int num=20;
		long longnum=num;
		//byte bytenum=(byte)num;
		System.out.println(longnum);
		System.out.println((double)7/4);
		
		int num1 = 10;
		int num2 = 20;
		int res = num1++ + ++num2;
		System.out.println(res);
		
		int shiftNum = -1;
		System.out.println(shiftNum << 1);
		System.out.println(shiftNum << 2);
		System.out.println(shiftNum << 3);
		System.out.println(shiftNum << 4);
		
		System.out.println(shiftNum >> 1);
		System.out.println(shiftNum >>> 1);
		
	}

}
