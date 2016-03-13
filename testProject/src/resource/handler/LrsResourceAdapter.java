/**
 * <p>Description: Resource Adapter Interface</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 * @author jerry cao
 * @created 17 Apr 2007
 * @version Revision: 1
 */
package resource.handler;

import java.util.Locale;



/**
 * Resource Adaptor interface
 * Using this interface we can adapt the property resource file
 * Xml resource file, Database resource table
 */
public interface LrsResourceAdapter {

	/**
	 * get specific resource string via key name
	 * @param key
	 * @return
	 */
	public String getString(String key);
	
	/**
	 * get specific resource object via key name
	 * @param key
	 * @return
	 */
	public Object getObject(String key);
	
	/**
	 * get specific resource exception message object via key name
	 * @param key
	 * @return
	 */
	public LrsExceptionMessage getExceptionMessage(String key);
	
	/**
	 * change the locale of current Resource Adapter to specific locale
	 * @param locale
	 */
	public void switchLocale(Locale locale);
	
}
