package designPattern.java;

/*
 * clone을 쓰기 위해서는 Cloneable Interface 가 구현된 class만이 사용할 수 있다.
 * 배열은 이미 구현되어 있으므로, 별도의 소스 작성없이 바로 clone() 사용 가능.
 */

public class CloneArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = new int[]{5,4,6,9,7,9};
		int[] desc = {10,20,30,40,50,60,70};
		
		System.arraycopy(src, 2, desc, 3, 4);
		/*
		for(int i=0;i<desc.length;i++){
			System.out.println(" desc[" + i + "] :" + desc[i]);
		}*/
		
		int[] src2 = new int[]{1,4,6,9};
		int[] desc2 = (int[])src2.clone();
		
		for(int i=0; i<desc2.length; i++){
			System.out.println(" desc2["+i+"] : " +desc2[i]);
		}
		
	}

}
