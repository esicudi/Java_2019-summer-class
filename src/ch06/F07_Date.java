package ch06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class F07_Date {
	/*
	 * 날짜, 시간 관련 클래스
	 * 구버전
	 * 	Date Class
	 * 	Calendar Class(추상클래스)
	 * 자바8~
	 * 	LocalDate		:시간(h,m,s,nanos)
	 * 	LocalTime		:날짜(y,M,d)
	 * 	LocalDateTime	:시간과 날짜
	 * 
	 * 	DateFormat
	 * 	SimpleDateFormat
	 * 
	 * Date
	 * 	Date() : 현재시간
	 * 	Date(long date) : 1970 01 01 09:00:00에서 밀리초 단위로 증가
	 */
	public static void main(String[] args) {
//		System.currentTimeMillis();
		Date date=new Date();
		System.out.println(date);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		cal.add(Calendar.HOUR, 10);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		//1초마다 시간 출력
		date=new Date();
		//date.getTime()+10000>System.currentTimeMillis()
		//위의 조건식을 사용할 때는 반복문 안에 있는 Date의 객체와 다른 이름으로 작성
		DateFormat dateFormat=new SimpleDateFormat("yyyy년MM월dd일");
		
		
//		while(date.getTime()+10000>System.currentTimeMillis()) {
//			if(date.getTime()+1000<=System.currentTimeMillis()) {
//				System.out.println(
//						dateFormat.format(date));
//				date.setTime(System.currentTimeMillis());
//			}
//		}
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		lt.getHour();
		lt.getMinute();
		lt.getSecond();
		lt.getNano();
		
		lt.plusHours(0);
		lt.plusMinutes(0);
		lt.plusSeconds(0);
		lt.plusNanos(0);
		
		lt.minusHours(0);
		lt.minusMinutes(0);
		lt.minusSeconds(0);
		lt.minusNanos(0);
	}
}
