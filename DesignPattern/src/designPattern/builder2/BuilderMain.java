package designPattern.builder2;

/**
 * 
   <pre>
    designPattern.builder2 / BuilderMain.java
    1. 설명 : factory pattern, abstract factory pattern과 비슷
            기존 factory pattern에는 3가지 중대한 문제가 있다.(factory 패키지에 기술되어있음)
            
            이러한 문제를 해결하기 위해 builder pattern은 선택적인 파라미터가 많을 경우 제공 상태를 일관성 있게 해주고, object를 생성시킬때 step-by-step으로 만들수 있도록
            제공해주며 최종에는 만들어지는 object를 리턴한다.
            
   2. SprintMVC 4.1이후 ResponseEntity<>에도 적용가능.
   </pre>
 * @author admin
 * @Date   2018. 12. 6.
 */



public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product.ProductBuilder("test", 1000)
				                .setIsSellEnabled(true)
				                .build();
	}

}
