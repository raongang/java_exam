import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeCompare {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String genTime ="D:20160201140810+09'00'";
		//String genTime ="D:20191201092510+09'00'";
		System.out.println("genTime : " + genTime);
		
		int startIndex = genTime.indexOf(":");
		int lastIndex = genTime.indexOf("+");
		
		String parsing = genTime.substring(startIndex+1, lastIndex);
		System.out.println("parsing >> " + parsing);
		
		
		SimpleDateFormat date_formatter2 = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = date_formatter2.parse(parsing);
		System.out.println("date : " + date);
		Calendar genCal = Calendar.getInstance();
		genCal.setTime(date);
		System.out.println(date_formatter2.format(genCal.getTime()));
		
		//유효기간만큼 증가
		genCal.add(Calendar.DATE, 30);
		System.out.println("유효기간1 >> " + genCal.getTime());
		System.out.println("유효기간2 >>" + date_formatter2.format(genCal.getTime()));
		
		
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat date_formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println("로컬기간 >>"+ date_formatter.format(calendar.getTime()));
		
		
		/*
		 *  compareTo 
		 *    0 : 두 Calendar가 같음
		 *   -1 : 앞의 Calendar가 더 이전 날짜. (유효) - 
		 *    1 : 앞의 Calendar가 더 이후 날짜. (만료) - 에러코드 101 
		*/
		int periodChk = calendar.compareTo(genCal);
		
		if(periodChk==-1){
			System.out.println("유효기간 유효");
		}else if(periodChk==1){
			System.out.println("유효기간 만료");
		} 
		
	}
}
