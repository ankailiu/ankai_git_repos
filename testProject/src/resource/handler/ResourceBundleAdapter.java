/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Lombard Risk Systems Ltd</p>
 */
package resource.handler;

import java.util.Locale;
import java.util.ResourceBundle;

//import org.apache.log4j.Category;

//import com.lombardrisk.common.exception.LrsExceptionMessage;

/**
 * Resource bundle based resource adapter implementation
 * @author jerry cao
 * @created 17 Apr 2007
 * @version Revision: 1
 */
public class ResourceBundleAdapter implements LrsResourceAdapter {
	//resource bundle
	private ResourceBundle bundle = null;
	//the resource file location
	private String resourcePath = null;
	//current locale
	private Locale locale = null;
	//log instance
//	private static Category log = Category.getInstance(ResourceBundleAdapter.class);

	public ResourceBundleAdapter(ResourceBundle bundle,String path,Locale locale){
		this();
		this.bundle = bundle;
		this.resourcePath = path;
		this.locale =locale;
	}
	
	private ResourceBundleAdapter(){	}	
	
	public Object getObject(String key) {
		if(bundle != null){
			return bundle.getObject(key);
		}else{
			return null;
		}
	}


	public String getString(String key) {
		if(bundle != null){
			return bundle.getString(key);
		}else{
			return null;
		}
	}

	public ResourceBundle getBundle() {
		return bundle;
	}

	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}

	public LrsExceptionMessage getExceptionMessage(String key) {
		LrsExceptionMessage message = null;
		// the message in property file should like the following
		// key=......
		if(bundle != null){
			message = new LrsExceptionMessage(key);
			message.setOrginalMessage(getString(key));
		}else{
			message = new LrsExceptionMessage(key);
			message.setOrginalMessage(key);
		}
		return message;
	}

	public void switchLocale(Locale locale){
		if(locale != null && !locale.equals(this.locale)){
			bundle = ResourceBundle.getBundle(resourcePath, locale);
			if(bundle == null){
//				log.warn(String.format("Resource bundle %s for locale %s is not found,using default locale instead",
//									  new Object[]{resourcePath,locale.toString()}));
				bundle = ResourceBundle.getBundle(resourcePath);
			}
		}
	}
}
