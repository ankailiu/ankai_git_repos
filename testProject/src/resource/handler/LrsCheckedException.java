/**
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 */


package resource.handler;

/**
 * @author jerry cao
 * @created 16 Apr 2007
 * @version $ Revision: 1 $
 * A CheckedException base class. 
 * This class implements a pattern where
 * exceptions have a <i>messageKey</i>
 * A message key indicates the standard exception code defined in external resource
 */
public class LrsCheckedException extends Exception {
		
    private static final long serialVersionUID = -668201172231360638L;
    private String messageKey;
    
    //args used to format message
    private Object[] formatedArgs;
      
	public LrsCheckedException(){
		this(null,null,(Object[])null);
	}
	
	public LrsCheckedException(Throwable cause,String key,Object...args){
		super(cause);
		setMessageKey(key);
		setFormatedArgs(args);
	}
	
	public LrsCheckedException(String key,Object...args){
		this(null,key,args);
	}
	
	public LrsCheckedException(String key){
		this(key,null,(Object[])null);
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
