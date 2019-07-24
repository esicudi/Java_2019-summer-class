package ch06;

public class F04_StringMethod {
	public static void main(String[] args) {
		String str="Hello World!!";
		
		System.out.println("charAt(index)");
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("concat(str)");
		String str2=str.concat("Java!!");
		System.out.println(str2);
		
		System.out.println("replace(oldStr,newStr)");
		str2=str.replace("Hello", "Hi");
		System.out.println(str2);
		
		str2="Kim/25/G/2";
		String strArray[]=str2.split("/");
		for(String s:strArray)
			System.out.println(s);
	}
}
