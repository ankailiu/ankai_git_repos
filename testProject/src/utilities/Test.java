package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {
	
	public static void main(String args[]){
		
//		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			java.util.Date mydate= myFormatter.parse("2012-10-25");
//			java.util.Date mydate1= myFormatter.parse("2012-10-26");
////			System.out.println(mydate.getTime());
////			System.out.println(mydate1.getTime());
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}   
		
//		long   day=(date.getTime()-mydate.getTime())/(24*60*60*1000);
//		Date dt = new java.util.Date(1351094400000l);
//		Date dt1 = new java.util.Date(1351180800000l);
//		Date dt2 = new java.util.Date(1351221072917l);
//		Date dt3 = new java.util.Date(1351098000000l);
		
//		System.out.println(dt);
//		System.out.println(dt1);
//		System.out.println(dt2);
//		System.out.println(dt3);
		
		Test t = new Test();
//		t.testSplitString();
		t.testSplitString();
		
	}
	
	
	private void testLoop(){
		List<Long> longa = null;
		for(Long a : longa){
			System.out.println(a);
		}
		
	}
	
	public void testSplitString(){
		String str = "abc";
		String strArray[] = str.split(",");
		
		for(String s : strArray){
			System.out.println(s);
		}
	}

}
