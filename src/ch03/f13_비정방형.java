package ch03;

public class f13_비정방형 {
	public static void main(String[] args) {
		int intArr[][]=new int[3][];
		intArr[0]=new int[5];
		intArr[1]=new int[3];
		intArr[2]=new int[7];
		for(int i=0,count=1;i<intArr.length;i++) {
//			System.out.println(intArr[i].length);
			for(int j=0;j<intArr[i].length;j++)
				intArr[i][j]=count++;
		}
		for(int i=0,count=1;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++)
				System.out.print(intArr[i][j]+"\t");
			System.out.println();
		}
	}

}
