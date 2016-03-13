package designpatterns.chainofresponsibility;

public class StringToStringHandler extends AbstractHandler {

	@Override
	public boolean isInstanceOf() {
		if(value instanceof String){
			return true;
		}
		return false;
	}

	@Override
	public String handle() {
		return value.toString();
	}

}
