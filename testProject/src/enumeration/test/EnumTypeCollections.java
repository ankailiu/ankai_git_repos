package enumeration.test;

public class EnumTypeCollections {
	
	public enum IM_TYPE{		
		 IT_NET(1), 
		 IT_IMOM(2),
		 IT_GROSS(3),
		 IT_GROSS_IMOM(4),
		 IT_GROSS_IM(5);
		 
		  private final int value;
		  private IM_TYPE(int type){
			  this.value = type;
		  }
		  public int getValue(){
			  return value;
		  }
	 }
	
	public enum OrderStatus {
		Normal(0), Closed(-1);

		private int value;

		private OrderStatus(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public static OrderStatus getOrderStatusByValue(int value) {
			OrderStatus[] values = OrderStatus.values();
			for (OrderStatus type : values) {
				if (type.getValue() == value)
					return type;
			}
			return OrderStatus.Normal;
		}
	}
	
	public enum SelectItemNumeric{
		EQ(0,"eq"),
		GT(1,"gt"),
		LT(2,"lt"),
		NE(3,"ne");
		
		SelectItemNumeric(int pageType,String criteriaType){
			this.pageType = pageType;
			this.criteriaType = criteriaType;
		}
		
		
		public static String getType(int pageType){
			for(SelectItemNumeric selectType:SelectItemNumeric.values()){
				if(selectType.getPageType()==pageType){
					return selectType.getCriteriaType();
				}
			}
			return EQ.getCriteriaType();
		}
		
		private int pageType;
		private String criteriaType;

		public int getPageType() {
			return pageType;
		}

		public void setPageType(int pageType) {
			this.pageType = pageType;
		}

		public String getCriteriaType() {
			return criteriaType;
		}

		public void setCriteriaType(String criteriaType) {
			this.criteriaType = criteriaType;
		}		
	}

}
