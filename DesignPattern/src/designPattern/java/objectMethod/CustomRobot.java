package designPattern.java.objectMethod;

public class CustomRobot {
	
	private int productNumber;
	private String modelName;
	
	public CustomRobot(int productNumber, String modelName) {
		super();
		this.productNumber = productNumber;
		this.modelName = modelName;
	}

	public int getProductName() {
		return productNumber;
	}

	public void setProductName(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	//객체에 대한 메모리 주소 매핑 정보를 기반으로 정수값 반환
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + productNumber;
		
		return result;
		
	}

	/*
	 * .equals() - 객체의 레퍼런스가 아닌 객체의 내용이 같은지를 판단.
	 * == - 메모리 상에 같은 객체인지를 판단한다.
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		
		CustomRobot other = (CustomRobot)obj;
		if(modelName == null){
			if(other.modelName != null)
				return false;
		}else if(!modelName.equals(other.modelName))
			return false;
		if(productNumber != other.productNumber)
			return false;
		return true;
	}
}
