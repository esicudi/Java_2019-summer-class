package ch05_class2;

public interface Call extends MP3{
	String PHONE_NUMBER="01012345678";
	abstract void call();
	abstract void recive();
	abstract void printUserInformation();
	default void Calling() {
		System.out.println("Connecting...");
	}
}
