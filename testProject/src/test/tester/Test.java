package test.tester;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
//		Test t = new Test();
////		t.test2();
//		Date date = new Date();
//		long time = date.getTime();
//		System.out.println(time);
//		
//		
//		
//		
//		 int cnt=0,num=1;
//         while(true)
//         {
//             if(num%2==0||num%3==0)cnt++;
//             if(cnt==2333)break;
//             num++;
//         }
//         System.out.println(num);
		
		
		System.out.println(0.01d+0.05f);
	} 
	
	
	 public static String getTimestamp_1970() throws Exception {
		  java.text.SimpleDateFormat formater = new SimpleDateFormat(
		  "yyyy-MM-dd HH:mm:ss");
		  java.util.Date   date=   formater.parse("1970-01-01 00:00:00");   
		  return Long.toString(date.getTime());
		 }
	
	public static void test1(){
		int num = 1;
		if(num == 1){
			return;
		}
	}
	
	
	public void test2(){
		BigDecimal splitCnyAmount = new BigDecimal(9.01);
		if(splitCnyAmount.compareTo(new BigDecimal(9)) != 0){
			System.out.println("PPPPPPPPPPP");
		}
		
//		System.out.println("ooooooo"+splitCnyAmount.compareTo(new BigDecimal(-4)));

//		if(splitCnyAmount.compareTo(BigDecimal.ZERO) == 0){
//			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
//		}
	}
	
	public static boolean isValidDate(String str) {
		 boolean convertSuccess=true;
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 try {
		 // ����lenientΪfalse. ����SimpleDateFormat��ȽϿ��ɵ���֤���ڣ�����2007/02/29�ᱻ���ܣ���ת����2007/03/01
			 format.setLenient(false);
			 format.parse(str);
		 } catch (ParseException e) {
		      // e.printStackTrace();
			  // ���throw java.text.ParseException����NullPointerException����˵����ʽ����
		     convertSuccess=false;
		     System.out.println("SSSSSSSSSSSSSSSSSSSS");
		 } 
		 return convertSuccess;
	}

}
