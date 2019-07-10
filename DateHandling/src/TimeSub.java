
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormatter = new SimpleDateFormat ("yyyyMMdd", Locale.KOREA);
		
		Date sourceDate1 = null;
        Date sourceDate2 = null;
		
		String epDate = null;
		int elapsedTime = 0;
		
		Date today = new Date(); //로컬시간 추출변수
		
		Date date = null; 
		int ep = 90; //유효기간 90일로 설정
		String testTime ="20190701140810"; //테스트데이터
		SimpleDateFormat localDf = new SimpleDateFormat("yyyyMMddHHmmss");
		try {
			date = localDf.parse(testTime);
			System.out.println("date : " + date);
			Calendar genCal = Calendar.getInstance();
			genCal.setTime(date);
			System.out.println("timeInTST : " + localDf.format(genCal.getTime()));
			
			epDate = getEffectivePeriodDate(date,ep);
			
			//string을 date형식으로 바꾸기 위해 parse이용
			sourceDate1 = dateFormatter.parse(epDate);
			sourceDate2 = dateFormatter.parse(dateFormatter.format(today));
			
			//getTime이 1/1000로 나오니 이를 이용 1000 => 1초 * 60 => 1분 * 60 => 1시간 * 24 => 24시간(즉1일)
			elapsedTime = (int) (( sourceDate1.getTime() - sourceDate2.getTime() ) / ( 1000 * 60 * 60 *24 ));
			
			
			System.out.println("Today : " + dateFormatter.format(today));
			System.out.println("Effective Date : " + epDate); 
	        System.out.println("Elapsed Time : " + elapsedTime );
	        System.out.println("--------------------------------");
			
			
	        if (elapsedTime >= 0) {
	           	System.out.println("Effective\n");
	        }else {
	           	System.out.println("Expiration\n");
	        }
	        
	        
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//end main

	
	//
	private static String getEffectivePeriodDate(Date date, int iDay) {
		// TODO Auto-generated method stub
		 Calendar temp=Calendar.getInstance ( TimeZone.getTimeZone("Asia/Seoul") );
		 StringBuffer sbDate=new StringBuffer ( );
		 
		 temp.setTime(date);

		 temp.add ( Calendar.DAY_OF_MONTH, iDay );

		 int nYear = temp.get ( Calendar.YEAR );
		 int nMonth = temp.get ( Calendar.MONTH ) + 1;
		 int nDay = temp.get ( Calendar.DAY_OF_MONTH );

		 sbDate.append (nYear);
		 if ( nMonth < 10 ) 
			 sbDate.append ("0");
		 sbDate.append (nMonth);
		 if ( nDay < 10 ) 
			 sbDate.append ("0");
		 sbDate.append (nDay);
		 
		 System.out.println("유효기간 적용된 sbDate : " + sbDate.toString());
		 
		 return sbDate.toString ();
	}//end method
}//end class
