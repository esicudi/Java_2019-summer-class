package ch08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F04_FileIO {
	/*
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
	public static void main(String[] args) {
		Path path=Paths.get("./work/Info.txt");
		Path temp=Paths.get("./work/temp.txt");
		Path newFile=Paths.get("./work/newFile.txt");
		Path newDir=Paths.get("./homework");
		try {
			Files.copy(path,temp);
			Files.createFile(newFile);
			Files.createDirectory(newDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
