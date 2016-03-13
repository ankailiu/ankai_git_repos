package designpatterns.chainofresponsibility;

public class IntegerToStringHandler extends AbstractHandler {

	@Override
	public boolean isInstanceOf() {
		if(value instanceof Integer){
			return true;
		}
		return false;
	}

	@Override
	public String handle() {
		Integer number = (Integer) value;
		return String.valueOf(number);
	}

}
