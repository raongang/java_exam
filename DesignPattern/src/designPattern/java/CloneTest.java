package designPattern.java;

import java.util.Calendar;

/**
 * Object class의 method 
 * 기능     : 오브젝트(객체)를 복사해서 return시켜준다.
 * 주의사항 : Clonable interface의 abstract method임.
 *            Clonable interface가 구현된 class만 clone()메소드를 통한 복제가 가능하다.
 *     ex   : Calendar 의 clone Test
 *     
 * cf.) 배열을 복사하기 위해서도 clone()을 사용하기도 한다.     
 */
public class CloneTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1985,6,8);
		
		System.out.println("(calendar)모프의 birthday : " );
		System.out.println(calendar.get(Calendar.YEAR) +"년"+
						   calendar.get(Calendar.MONTH) +"월"+
						   calendar.get(Calendar.DAY_OF_MONTH) + "일");
	    // Calendar 복사
		Calendar calendar2 = (Calendar)calendar.clone();
		
		System.out.println("(calendar2)모프의 birthday : " );
		System.out.println(calendar2.get(Calendar.YEAR) +"년"+
						   calendar2.get(Calendar.MONTH) +"월"+
						   calendar2.get(Calendar.DAY_OF_MONTH) + "일");
	    // Calendar 복사
	}
}
