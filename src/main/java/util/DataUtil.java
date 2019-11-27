package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
         //字符串变成date类型
	  public static Date ToDate(String DataFormat,String Date) {
		
		   SimpleDateFormat sdf=new SimpleDateFormat(DataFormat);
		   try {
			return sdf.parse(Date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		  
		  return null;
		  
	  }
	  //   date类型变成字符串类型
	  public static String dateToString(String dateFormat,Date date) {
		return new SimpleDateFormat(dateFormat).format(date);
		  
	  }
	
	
	
}
