/**
 * <p>Description: Resource Adaptor Factory</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 */
package resource.handler;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

//import org.apache.log4j.Category;


/**
 * Resource Adapter Factory class
 * @author jerry cao
 * @created 17 Apr 2007
 * @version Revision: 1 
 */
public class LrsResourceAdapterFactory {

//	private static Category log = Category.getInstance(LrsResourceAdapterFactory.class);
	
	private static final String MESSAGE_RESOURCE_PREFIX = "resource/handler/";
	private static final String MESSAGE_HEADER_COLLATERAL = "collateral";
	private static final String MESSAGE_RESOURCE_COLLATERAL = MESSAGE_RESOURCE_PREFIX;
	private static final String MESSAGE_HEADER_ORG = "organisation";
	private static final String MESSAGE_RESOURCE_ORG = MESSAGE_RESOURCE_PREFIX;
	private static final String MESSAGE_RESOURCE_F3 = MESSAGE_RESOURCE_PREFIX;
	private static final String MESSAGE_HEADER_F3 = "f3";
	private static final String MESSAGE_RESOURCE_COMMON = MESSAGE_RESOURCE_PREFIX;
	private static final String MESSAGE_HEADER_COMMON = "common";
	
	private static final String MESSAGE_RESOURCE_SUFFIX = "Messages";
	public enum ResourceDomainEnums{		
	
		RES_COLLATERAL(MESSAGE_HEADER_COLLATERAL,MESSAGE_RESOURCE_COLLATERAL),
		RES_ORG(MESSAGE_HEADER_ORG,MESSAGE_RESOURCE_ORG),
		RES_F3(MESSAGE_HEADER_F3,MESSAGE_RESOURCE_F3),
		RES_COMMON(MESSAGE_HEADER_COMMON,MESSAGE_RESOURCE_COMMON);
		private String header;
		private String path;
		
		private ResourceDomainEnums(String header,String path){
			this.header = header;
			//path 
			this.path = path + header + MESSAGE_RESOURCE_SUFFIX;
		}
		public String toString(){
			return header + ":" + path;
		}
		
		public String getHeader(){
			return header;
		}
		
		public String getPath(){
			return path;
		}
	}
	
	private static Map<String,String> resourcePathMap = new HashMap<String, String>();
	
	//initialize system level resource adpater map
	private static Map<String,LrsResourceAdapter> resourceMap 
			= new HashMap<String, LrsResourceAdapter>(); 
	
	//initialize the resource information
	static{
		for(ResourceDomainEnums resourceEnum:ResourceDomainEnums.values()){
			resourcePathMap.put(resourceEnum.getHeader(),resourceEnum.getPath());
		}
	}
	
	/**
	 * get resource bundle using specific locale  
	 * @param path    Resource bundle path
	 * @param locale  specific locale
	 * @return
	 */
	public static LrsResourceAdapter  getResourceBundleAdapter(String path,Locale locale){
		ResourceBundle bundle = ResourceBundle.getBundle(path, locale);
		return new ResourceBundleAdapter(bundle,path,locale);
	}
	
	/**
	 * using default locale to get resource bundle
	 * @param path  Resource bundle path
	 * @return
	 */
	public static LrsResourceAdapter  getResourceBundleAdapter(String path){
		ResourceBundle bundle = ResourceBundle.getBundle(path);
		return new ResourceBundleAdapter(bundle,path,null);
	}
	
	/**
	 * get Resource bundle by key and locale
	 * @param key
	 * @param locale
	 * @return
	 */
	public static LrsResourceAdapter getResourceBundleAdapterByKey(String key,Locale locale){
		
		LrsResourceAdapter adapter = null;
		
		String header = getKeyHeader(key);
		
		if(header != null){
			String resourceKey = locale==null ? header:header + locale.toString();
			adapter = resourceMap.get(resourceKey);
			if(adapter == null){
				String path = resourcePathMap.get(header);
				//if resource do not loaded when system startup, we guess the default path
				if(path==null){
					path = MESSAGE_RESOURCE_PREFIX + header + MESSAGE_RESOURCE_SUFFIX;
				}
				ResourceBundle bundle;
				if(locale != null){
					bundle = ResourceBundle.getBundle(path, locale);
				}else{
						bundle = ResourceBundle.getBundle(path);
				}
				if(bundle == null){
//					log.fatal("Can't find resource under path " + path);
				}
				adapter = new ResourceBundleAdapter(bundle,path,locale);
				synchronized (resourceMap) {
					resourceMap.put(resourceKey, adapter);
				}				
			}
		 }
		return adapter;
	}
	
	/**
	 * 	according to message key, get the message domain
	 *  for example all the message key from collateral will like collateral.xxx.xxx
	 *  we will retrieve collateral from message key
	 * @param key
	 * @return
	 */
	private static String getKeyHeader(String key){
		String header = null;
		int dotPos = key.indexOf(".");
		if(dotPos != -1){
			header = key.substring(0, dotPos);
		}
		return header;
	}
	
}
