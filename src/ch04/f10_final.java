package ch04;

public class f10_final {
	//final 필드: 상수로 만듦
	//final 메소드: 오버라이딩 불가능
	//final 상속 불가능
	final static String SERVER_IP="192.168.1.58";
	final static int PORT=20001;
	public static void main(String[] args) {
		//SERVER_IP+=1;	//누락 등과 같은 네트워크 지연 오류로 값이 변동
		System.out.println(SERVER_IP+"에 접속");
	}
}
