package resource.handler;

public class ResourceTest {

	/**
	 * @param args
	 */
	
	public static final String COLLATERAL_FEED_DUPLICATE = "collateral.feed.duplicate";
	
	public static void main(String[] args) {
		String warnMsg = MessageResolver.getMessage(COLLATERAL_FEED_DUPLICATE, "AAA",
				"BBB", "CCC");
		
		System.out.println(" LLLLLLLLLLLLLLLLLLLLL "+warnMsg);

	}

}
