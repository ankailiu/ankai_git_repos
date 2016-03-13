/**
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 */
package resource.handler;

/**
 * Unchecked exception base class
 * similiar with LrsCheckedException
 * @see LrsCheckedException
 * @author jerry cao
 * @created 16 May 2007
 * @version Revision: 1
 */
public class LrsUnCheckedException extends RuntimeException {
    private static final long serialVersionUID = 5456971488091669737L;
	private String messageKey;
    //args used to format message
    private Object[] formatedArgs;
      
	public LrsUnCheckedException(){
		this(null,null,(Object[])null);
	}

	
	public LrsUnCheckedException(Throwable cause,String key,Object...args){
		super(cause);
		setMessageKey(key);
		setFormatedArgs(args);
	}
	
	public LrsUnCheckedException(String key,Object... args){
		this(null,key,args);
	}
	
	public LrsUnCheckedException(String key){
		this(null,key,(Object[])null);
	}	
	
	//return message using default locale
	@Override
	public String getMessage(){
		return ExceptionUtils.formatExcetpionMsg(this);
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public Object[] getFormatedArgs() {
		return formatedArgs;
	}

	public void setFormatedArgs(Object[] formatedArgs) {
		this.formatedArgs = formatedArgs;
	}
	
	@Override
	public String toString(){
		return "Key:" + messageKey + "\n" + getMessage();
	}
}
