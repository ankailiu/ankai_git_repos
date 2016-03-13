/**
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 */
package resource.handler;

import java.text.MessageFormat;
import java.util.Locale;


/**
 * Exception base class Utility class
 * @author jerry cao
 * @created 16 Apr 2007
 * @version Revision: 1
 */
public class ExceptionUtils {
	
	/**
	 * format General Exception using specific locale 
	 * @param exp     exception object
	 * @param locale  the client locale
	 * @return
	 */
	private static String formatGeneralExceptionMsg(Exception exp,Locale locale){
		
		LrsExceptionMessage message = null;
		
		message = getGeneralExceptionMessage(exp, locale);
		
		return getCompleteMessage(message,locale);
		
	}
	
	/**
	 * using default locale to format Exception 
	 * @param exp
	 * @return
	 */
	public static String formatExcetpionMsg(Exception exp){
		return formatGeneralExceptionMsg(exp,null);
	}	
	

	/**
	 * using specific locale to format Exception
	 * @param exp
	 * @return
	 */
	public static String formatExcetpionMsg(Exception exp,
			Locale loc){
		return formatGeneralExceptionMsg(exp,loc);
	}		

	/**
	 * get the formmatted message according to specific locale
	 * @param message
	 * @param locale
	 * @return
	 */
	private static String getCompleteMessage(LrsExceptionMessage message,Locale locale){
		StringBuilder sb = new StringBuilder();		
		if(!isEmptyString(message.getOrginalMessage())){
			String formmatted = formatMessageWithLocale(message.getOrginalMessage(), 
														locale,
														message.getArgs());			
			sb.append(formmatted);
			sb.append("\n");
			message.setFormmatedMessage(formmatted);
		}	
		return sb.toString();
	}

	/**
	 * format specific string with locale and formatted arguments
	 * @param message
	 * @param args
	 * @param locale
	 * @return
	 */
	public static String formatMessageWithLocale(String message, Locale locale,Object... args) {
		MessageFormat formatter = new MessageFormat("");
		if(locale != null){
			formatter.setLocale(locale);
		}
		formatter.applyPattern(message);	
		String formmatted = formatter.format(args);
		return formmatted;
	}
	
	
	/**
	 * get root LrsCheckedException cause for one LrsCheckedException
	 * @param e
	 * @return
	 */
	public static LrsCheckedException getRootCause(LrsCheckedException e){
		LrsCheckedException root = e;
		while((root != null) 
				&& (root.getCause()!=null) 
				&&(root.getCause() instanceof LrsCheckedException )){			
			root = (LrsCheckedException)root.getCause();
		}
		return root;
	}
	
	
	/**
	 * get root LrsUnCheckedException cause for one LrsCheckedException
	 * @param e
	 * @return
	 */
	public static LrsUnCheckedException getRootCause(LrsUnCheckedException e){
		LrsUnCheckedException root = e;
		while((root != null) 
				&& (root.getCause()!=null) 
				&&(root.getCause() instanceof LrsUnCheckedException )){			
			root = (LrsUnCheckedException)root.getCause();
		}
		return root;
	}
	
	/**
	 * get root cause for a general exception 
	 * @param e
	 * @return
	 */
	public static Throwable getRootCause(Throwable e){
		Throwable root = e;
		while((root != null) && root.getCause() != null){
			root = root.getCause();
		}
		return root;
	}
	
	/**
	 * return a wrapped LrsExceptionMessage to contains the formatted localized message
	 * @param e
	 * @param loc
	 * @return
	 */
	private static LrsExceptionMessage getGeneralExceptionMessage(Exception e,
			Locale loc){	
		LrsExceptionMessage message = null;
		String key;
		Object[] args;
		
		if(e instanceof LrsCheckedException){
			LrsCheckedException checkExp =(LrsCheckedException)e; 
			key = checkExp.getMessageKey();
			args = checkExp.getFormatedArgs();
		}else if(e instanceof LrsUnCheckedException){
			LrsUnCheckedException uncheckExp =(LrsUnCheckedException)e; 
			key = uncheckExp.getMessageKey();
			args = uncheckExp.getFormatedArgs();			
		}else{
			return message;
		}
		
		message = MessageResolver.buildMessage(key, loc, args);

		if(message != null){			
			fillNestedMessage(e, loc, message);			
			message.format(loc, args);
		}	
		
		return message;
	}
		

	/**
	 * return a wrapped LrsExceptionMessage using default locale
	 * @param e
	 * @return
	 */
	public static LrsExceptionMessage getExceptionMessage(Exception e){
		return getGeneralExceptionMessage(e,null);
	}	
		
	/**
	 * return a wrapped LrsExceptionMessage using specific locale
	 * @param e
	 * @return
	 */
	public static LrsExceptionMessage getExceptionMessage(Exception e,
			Locale loc){
		return getGeneralExceptionMessage(e,loc);
	}	
		
	/**
	 * fill nested message information according to exception
	 * @param e
	 * @param loc
	 * @param message
	 * @param key
	 */
	private static void fillNestedMessage(Exception e, Locale loc, 
			LrsExceptionMessage message) {
		
		Throwable nestedExp = e.getCause();
		while(nestedExp != null){
			LrsExceptionMessage nestedMessage = null;
			if(nestedExp instanceof LrsCheckedException){
				LrsCheckedException checkedExp = (LrsCheckedException)nestedExp;
				nestedMessage = getGeneralExceptionMessage(checkedExp,loc);				
			}else if(nestedExp instanceof LrsUnCheckedException){
				LrsUnCheckedException uncheckedExp = (LrsUnCheckedException)nestedExp;
				nestedMessage = getGeneralExceptionMessage(uncheckedExp,loc);
			//we do not deal with other type of exceptions	
			}else{
				return ;
			}
			nestedMessage.format(loc);
			message.addNestedMessage(nestedMessage.getMessageKey(), nestedMessage);
			nestedExp = nestedExp.getCause();
		}
	}
	
	
	private static boolean isEmptyString(String str){
		return (str == null || str.length()==0);
	}
}
