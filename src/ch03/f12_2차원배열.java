package ch03;

public class f12_2차원배열 {
	/*
	 * 	2차원 배열
	 * 	레퍼런스 변수->배열(레퍼런스 변수)->배열(데이터)
	 */
	public static void main(String[] args) {
//		int intArr[][];
//		intArr=new int[5][4];
//		int[][] intArr2= {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(intArr2[2][1]);
		
		
		int intarr[][]=new int[4][5];
		for(int i=0,count=1;i<intarr.length;i++) {
			for(int j=0;j<intarr[i].length;j++)
				intarr[i][j]=count++;
		}
		for(int i=0;i<intarr.length;i++) {
			for(int j=0;j<intarr[i].length;j++)
				System.out.print(intarr[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<intarr[0].length;i++) {
			for(int j=0;j<intarr.length;j++)
				System.out.printf("%2d\t",intarr[j][i]);
			System.out.println();
		}
	}

}
