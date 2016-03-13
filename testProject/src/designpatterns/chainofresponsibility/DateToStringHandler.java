package designpatterns.chainofresponsibility;

import java.util.Date;

public class DateToStringHandler extends AbstractHandler {

	@Override
	public boolean isInstanceOf() {
		if(value instanceof Date){
			return true;
		}
		return false;
	}

	@Override
	public String handle() {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();
		return sdf.format(value);
	}

}
