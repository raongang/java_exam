package designPattern.java;

public class CloneAbleUse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneAbleImpl c1 = new CloneAbleImpl("Morph");
		CloneAbleImpl c2 = null;
		
		try {
			c2 = (CloneAbleImpl)c1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("c1 name : " + c1.getName());
		System.out.println("c2 name : " + c2.getName());
		
		System.out.println("c1 address : " + c1);
		System.out.println("c2 address : " + c2);
	}
}
