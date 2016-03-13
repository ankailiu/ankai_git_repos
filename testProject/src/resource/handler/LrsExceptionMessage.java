/**
 * <p>Description: Exception Message Data Object</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 */
package resource.handler;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Exception Message Object 
 * hold message key,origional message and formmatted message
 * @author jerry cao
 * @created 17 Apr 2007
 * @version Revision: 1
*/
public class LrsExceptionMessage implements Serializable,Cloneable{
	
	private static final long serialVersionUID = -5077927290325454012L;
	//message key
	private String messageKey;
    //args need to be formatted
    private Object[] args;
    
    //origional messages with placeholder
    private String orginalMessage;
    
    //a formatted message using message args
    private String formmatedMessage;
     
    //nested messages
    private Map<String,LrsExceptionMessage> nestedMessage;
     
    //nested messages size
    private long nestedSize;
    
    //whether formatted,use to avoid format multiple times
    private boolean formatted;
    
    public LrsExceptionMessage(){
    	this(null,(Object[])null);
    }

    public LrsExceptionMessage(String messageKey){
    	this(messageKey,(Object[])null);
    }
    
    public LrsExceptionMessage(String messageKey,Object... args){
    	this.messageKey = messageKey;
    	this.args = args;
    	nestedMessage = new LinkedHashMap<String, LrsExceptionMessage>();
    }
        

	public String getOrginalMessage() {
		return orginalMessage;
	}
	
	public void setOrginalMessage(String symptom) {
		this.orginalMessage = symptom;
	}
	
	public String getFormmatedMessage() {
		return formmatedMessage;
	}

	public void setFormmatedMessage(String formmatedMessage) {
		formatted = true;
		this.formmatedMessage = formmatedMessage;
	}

	public Map<String,LrsExceptionMessage> getNestedMessage() {
		return nestedMessage;
	}
	
	public void addNestedMessage(String key, LrsExceptionMessage message){
		nestedMessage.put(key, message);
	}
	
	public void NestedMessages(Map<String,LrsExceptionMessage> map){
		nestedMessage.putAll(map);
	}
	
	public void clearNestedMessage(){
		nestedMessage.clear();
	}
	
	@Override
	public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException clonenotsupportedexception){
            throw new InternalError();
        }
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object... args) {
		this.args = args;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}
	
	/**
	 * return localized formmated message string
	 * @param locale
	 * @return
	 */
	public String format(Locale locale){
		return format(locale,false,getArgs());
	}
	
	public String format(Locale locale,Object...formattedArgs){
		return format(locale,true,formattedArgs);
	}
	
	/**
	 * return localized formmated message string 
	 * with specified args
	 * @param locale
	 * @param args
	 * @return
	 */
	private String format(Locale locale,boolean externalArgs,Object... formatArgs){
		if(formatted){
			return this.formmatedMessage;
		}
		//if args is from external, we will set args to current message object
		if(externalArgs){
			setArgs(formatArgs);
		}
		String formattedMsg = ExceptionUtils.formatMessageWithLocale(
				getOrginalMessage(),
				locale,
				formatArgs);
		setFormmatedMessage(formattedMsg);	
		return formattedMsg;		
	}
	
	public long getNestedSize(){
		nestedSize = nestedMessage.size();
		return nestedSize;
	}
	
	@Override
	public String toString(){
		if(formmatedMessage != null){
			return formmatedMessage;
		}else{
			return orginalMessage;
		}
	}
	
}
