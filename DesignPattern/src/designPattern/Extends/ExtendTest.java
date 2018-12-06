package designPattern.Extends;

public class ExtendTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pa = new Parent();
		Parent pb = new Child(pa);
		pa.print();
		
	}

}
