/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>

 */
package resource.handler;

import java.util.Locale;


/**
 * @author jerry cao
 * @created 26 Jun 2007
 * @version Revision: 1
 * class use to resolve the message according to message key
 */
public class MessageResolver {
	
	/**
	 * get formmmated message according to message key
	 * @param key   message key
	 * @param loc   locale
	 * @param args  message arguments
	 * @return
	 */
	public static String getMessage(String key,Locale loc, Object... args){
		LrsExceptionMessage message = buildMessage(key,loc,args);
		return message.format(loc);
	}
	
	public static String getMessage(String key,Object... args){
		return getMessage(key,null,args);
	}
	
	public static String getMessage(String key){
		return getMessage(key,null,(Object[])null);
	}
	
	public static String getMessage(String key,Locale loc){
		return getMessage(key,loc,(Object[])null);
	}
	
	/**
	 * build LrsExceptionMessage Object according to message key
	 * @param key
	 * @param loc
	 * @param args
	 * @return
	 */
	public static LrsExceptionMessage buildMessage(String key,Locale loc,Object... args){
		
		LrsResourceAdapter resource = null;
		LrsExceptionMessage message = null;		
		
		resource = LrsResourceAdapterFactory.getResourceBundleAdapterByKey(key, loc);
		if(resource != null){
			message = resource.getExceptionMessage(key);
			message.setArgs(args);
		}else{
			message = new LrsExceptionMessage(key,args);
			message.setOrginalMessage(key);
		}
		return message;
	}

	
}
