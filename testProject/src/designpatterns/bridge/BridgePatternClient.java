package designpatterns.bridge;

public class BridgePatternClient {

	public static void main(String[] args) {
		Log dblog = new DatabaseLog();
        dblog.logImplementor = new NImplLog();
        dblog.write(".Net platform database log");
        
    	Log textlog = new TextFileLog();
    	textlog.logImplementor = new JImplLog();
    	textlog.write("Java platform text log");

	}

}
