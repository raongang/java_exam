package designPattern.protoType;

import java.util.Date;

// ------------ 복잡한 정보를 가지고 있는 Complex ------------
public class Complex implements Cloneable{
	private String complexInfo;
	private Date date;
	
	public Complex(String complexInfo){
		this.complexInfo = complexInfo;
	}

	public String getComplexInfo() {
		return complexInfo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = new Date(date.getTime());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		Complex tmp = (Complex)super.clone();
		return tmp;
	}
	
	
	
	
	
	
}
