package ch08;
/*
 * ./work/operation.txt 를 읽어들여
 * 저장된 연산을 한 후 결과 값을 파일에 연산식과 함께 저장하는
 * 프로그램을 작성
 * 
 * operation 파일을 한 줄 씩 읽어 들여서 배열 또는 컬렉션에 저장
 * 모든 연산식을 저장을 한 다음에
 * 배열 또는 컬렉션에서 하나씩 가져와서 연산을 진행을 해주시면 됩니다.
 *  공백을 단위를 나눠서 정수 값은 Integer.parseInt(s) 로 변환
 *  
 * 모든 연산을 한 뒤 저장을 해도 되고(*), 한 연산을 끝나고 파일에 저장해도 됩니다.
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class F00_Problem04 {
	public static void main(String[] args) {
		File file=new File("./work/operation.txt");
		try {
			BufferedReader br=new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),"UTF-8"));
			String str;
			ArrayList<String> list=new ArrayList<>();
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			
			BufferedWriter bw=new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(file),"UTF-8"));
			for(int i=0;i<list.size();i++) {
				StringTokenizer st=new StringTokenizer(list.get(i));
				int a=Integer.parseInt(st.nextToken());
				String op=st.nextToken();
				int b=Integer.parseInt(st.nextToken());
				bw.append(a+" "+op+" "+b+" = ");
				System.out.print(a+" "+op+" "+b+" = ");
				switch(op.charAt(0)) {
				case '+':
					bw.append(String.valueOf(a+b));
					System.out.println(a+b);
					break;
				case '-':
					bw.append(String.valueOf(a-b));
					System.out.println(a-b);
					break;
				case '*':
					bw.append(String.valueOf(a*b));
					System.out.println(a*b);
					break;
				case '/':
					bw.append(String.valueOf(a/b));
					System.out.println(a/b);
					break;
				default:
				}
				bw.newLine();
			}
			bw.flush();
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
