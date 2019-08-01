package ch08;

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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * 파일 입출력 (File IO)
 *  파일은 프로그램에서 일반적인 리소스 중의 하나이다.
 *  설정 파일 및 사용자 및 외부 시스템에서의 파일 송수신 등 많이 사용.
 *  
 *  파일 입출력을 하기 위해선
 *   - 파일 경로 체크
 *   - 문자 코드의 취급
 *   - 대용량 파일의 조작
 *  등을 신경을 쓰면서 코드를 보다 '간결하고', '안전하고', '효율적으로'
 *  작성하기 위해선 많은 부분을 신경써줘야 한다.
 * 
 * File 클래스로 초기화하기
 *  자바에서 기본적으로 파일을 취급하는 java.io.File 클래스를 사용.
 *  File 클래스를 사용하면 파일의 존재 확인 및 디렉터리 내의 파일/디렉터리의 
 *  열거, 파일의 읽고 쓰기가 가능하다.
 *  
 *  File 클래스를 사용하기 위해서는 파일의 경로를 인수로 한 생성자를 사용한다.
 *   1) 파일을 절대 경로로 지정 - 파일이나 폴더의 위치를 최상위 계층에서부터 지정하는 표기법
 *  	File file1 = new File("C:/work/sample1.txt");
 *   2) 파일을 상대 경로로 지정 - 파일이나 폴더의 위치를 현재 위치를 기준으로 지정하는 표기법
 *  	File file2 = new File("./work/sample2.txt");
 *  	"./"	현재 폴더
 *  	"../"	상위 폴더
 *   
 *   경로 지정시 주의 할 점
 *    윈도우에서 파일의 경로 구분자는 '/' 뿐만 아니라 '\'를 사용을 한다.
 *    따라서 윈도우에서는  
 *    	File file1 = new File("C:\\work\\sample1.txt");
 *    이런 식으로 파일 객체를 생성할 수 있다.
 *    하지만 윈도우 외의 OS 에서는 파일 경로 구분자를 '/'만 사용하기 때문에
 *    윈도우 에서도 '/' 를 사용을 권장한다.
 *    또는 File.separator 상수를 사용하여 프로그램이 실행하는 OS의 파일 구분자를
 *    얻어서 사용이 가능하다.
 *     
 *  File 클래스의 생성자에 인수로 파일이 아닌 디렉터리를 지정했을 경우
 *  디렉터리를 읽어들여 현 디렉터리에 포함되어있는 파일이나 디렉터리의 이름을 가져온다.
 *  
 * 텍스트 파일 읽어 들이기
 *  자바 6 이전의 방법
 *   - FileInpustStream 클래스
 *   - InputStreamReader 클래스
 *   - BufferedReader 클래스
 *   
   		File file = new File("C:/work/sample.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),"UTF-8"));

			for(String line; (line = reader.readLine()) != null;) {
				System.out.println(line);
			}
		} catch(UnsupprotedEncodingException e) {
			System.err.println(e);
		} catch(FileNotFoundExcetpion e) {
			System.err.println(e);
				try {
					Path path = Paths.get("./work");
					Files.createDirectories(path);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		} catch(IOException e) {
			System.err.println(e);
		} finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOExcetopn e) {
					System.err.println(e);
				}
			}
		}

 * 
 * 텍스트 파일 쓰기
 *  자바 6 이전 버전
 *   - FileOutputStream
 *   - OutputStreamWriter
 *   - BufferedWriter
        File file = new File("C:/work/sample.txt");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file),"UTF-8"));
			writer.append("test");
			writer.newLine();
			writer.append("test2");
		}catch(UnsupportedEncodingException e ) {
			System.err.println(e);
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
 * 
 * 
 * Path 클래스로 초기화
 *  Path 란
 *  	Java 7 이후에는 java.nio.file.Path 클래스를 사용하여 파일을 조작하는
 *  	 java.nio.file 패키지가 추가되었다. 
 *  
 * 		 이전 버전의 File 클래스의 문제점
 * 		  - 파일의 메타 데이터(작성일, MIME 타입 등)와 심복릭 링크를 취급할 수 없다.
 * 		  - 디렉터리 밑의 파일의 생성/삭제/갱신을 감시할 수 없다.
 *  	  → 위의 문제를 해결하기 위해 Path 클래스와 Path 클래스를 사용하기 위한 유틸리티 클래스(Paths)
 * 		  → 위의 문제를 해결할 뿐만 아니라 파일 경로를 조작하는 편리하고 강력한 메서드가 다수 준비되어 있다.
 *  
 *  	 Path 객체와 File 객체는 상호 변환이 가능하다.
 *    
 * 	 주요 메소드
 * 		toString		: 경로를 문자열로 반환
 * 		toAbsolutePath	: 절대 경로를 반환
 * 		toFile			: File 객체 반환
 * 		toUri			: URI 반환
 * 		getParent		: 부모 경로를 반환
 * 		normalize		: 정규화한 경로를 반환
 * 		startsWith		: 지정된 경로로 시작하는지의 여부를 바환
 * 		endWith			: 지정된 경로로 끝나는지의 여부를 반환
 * 		resolve			: 결합한 경로를 반환
 * 		register		: 파일 감시 서비스를 등록
 *  
 * Paths 를 이용한 Path 클래스 객체 생성
 * 	1) 파일을 절대 경로로 지정
 * 		Path path1 = Paths.get("C:/work/sample1.txt");
 * 	2) 파일을 상대 경로로 지정
 *		Path path2 = Paths.get("./work/sample2.txt");
 *	3) 파일의 경로를 루트부터 순서대로 지정
 *		Path path3 = Path.get("C:","work","sample3.txt");
 *	4) URI uri = URI.create("file////C:/work/sample4.txt");
 *	   Path path4 = Paths.get(uri);
 *  
 * 
 * 텍스트 파일 읽어 들이기  
 *  자바 7 이후의 방법
 *   - try-with-resource 구문
 *   - Path 클래스
 *   - BufferedReader
 *   - Files 클래스의  newBufferedReader 메소드
 *   - StandaredCharets.UTF_8 상수
 *   
        Path path = Paths.get("C:/work/sample.txt");

		try(BufferedReader reader = 
				Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			for(String line; (line = reader.readLine()) != null; ) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.err.println(e);
		}

 *  
 * 
 * 텍스트 파일 쓰기 
 * 	자바 7 이후 텍스트 파일 쓰기
   		Path path = Paths.get("./work/sample.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,StandardOpenOption.APPEND)){
			writer.append("test");
			writer.newLine();
			writer.append("test5");
		}catch(IOException e) {
			System.err.println(e);
		}
		
		
 *
 *
 * 파일 조작하기 
 *  자바 7 이후 Files 클래스에 정의된 메소드로 간단히 조작이 가능
 *   복사 : Files.copy(fromFile, toFile);
 *   삭제 : Files.delete(path);  // 반환값이 없음
 *   	- 파일이 없으면 NoSuchFileException
 *   	- 폴더에 파일이 있으면 DirectoryNotEmptyException
 *   삭제 : Files.deleteIfExists(path); // 파일을 삭제한 경우 true, 파일이 없는 경우 false
 *      - 폴더에 파일이 있으면 DirectoryNotEmptyException
 *   		▶ 디렉터리를 삭제하려면 안에있는 파일도 지워야 함.
 *   		▶ path.toFile().list() 를 통해 파일 리스트를 가져 올 수 있음.
 *   생성 : Files.createFile(path)
 */
public class F03_FileIO {
	public static void main(String[] args) {
//		File file1=new File("C:/Users/Administrator/Desktop/김효경/aaa.txt");
//		File file2=new File("./aaa.txt");
//		File file3=new File(".");
//		for(String file:file3.list()) {
//			System.out.println(file);
//		}
		File file = new File("./work/sample.txt");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file),"UTF-8"));
			
			writer.write("Hello");
			writer.append("test");
			writer.newLine();
			writer.append("test2");
		}catch(UnsupportedEncodingException e ) {
			System.err.println(e);
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}

	}
}
