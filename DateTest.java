import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String authDate = "20220415135700";
		//String authDate = "20220416135700";
		boolean result = cancelTodayChk(authDate);
		System.out.println("result >> " + result);
	}

	 
	public static boolean cancelTodayChk(String temp) throws ParseException{

		SimpleDateFormat formatter2 = new SimpleDateFormat ("yyyyMMddHHmmss");

		//결제취소시간
		Date authDate = formatter2.parse(temp);
		System.out.println("authDate >> " + authDate);
		
		
		/** 금일 시간 범위 계산 00:00:00 ~ 23:59:59 */
		//금일 00:00:00 세팅
		Date todayS = timeSet(0,0,0);
		System.out.println("todayS >> " + todayS);
		
		//금일 23:59:59 세팅
		Date todayE = timeSet(23,59,59);
		System.out.println("todayE >> " + todayE);
		
		//전날일 경우 결제 취소 기준 시간 - 12시
		Date baseDate =timeSet(12,0,0);
		System.out.println("baseDate >> " +baseDate);
		
		/**전날 범위 계산 **/
		// 전날 00:00:00 
		Date prevDayS = prevDayTime(todayS);
		System.out.println("prevDayS >> " + prevDayS);
		//전날 23:59:59
		Date prevDayE = prevDayTime(todayE);
		System.out.println("prevDayE >> " + prevDayE);
		
		//지정날짜가 당일인지 체크
		//after - 주어진 날짜보다 이후면 False반환
		if((authDate.after(todayS) && authDate.before(todayE))) {
			System.out.println("Y");
			return true;
		}
		
		//전날이면 금일 12시까지만 가능. 
		if(authDate.after(prevDayS) && authDate.before(prevDayE)) {
			Date today = getyyyyMMddHHmmss2();
			System.out.println("today>>"+ today);
			if(today.before(baseDate)) {
				System.out.println("이전");
				return true;
			}else {
				System.out.println("이후");
				return false;
			}
		}
		
		return true;
		
	}
	
	// 시간 지정 함수.
	public static Date timeSet(int hour, int minute, int second) {
		Calendar cal =  Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE	, minute);
		cal.set(Calendar.SECOND	, second);
		return cal.getTime();
	}

	//전날 지정함수 (00:00:00 ~ 23:59:59)
	public static Date prevDayTime(Date date) {
		Calendar cal =  Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,-1);
		return cal.getTime();
	}
	 
	public static synchronized Date getyyyyMMddHHmmss2() {
		Calendar cl = Calendar.getInstance();
		return cl.getTime();
	}
	
}
