package designPattern.Builder;
/**
 * Builder pattern : 객체의 생성에 있어서 이런 복잡한 과정들을 분리해 내는 것이
 * @author admin
 *
 */
//-- 복잡한 과정을 거쳐서 만들어지는 객체가 될 Hero 클래스
public class Hero {
	private String armSource;
	private String legSource;
	private String name;
	
	public Hero(String name) {
		super();
		this.name = name;
	}

	public void setArmSource(String armSource) {
		this.armSource = armSource;
	}

	public void setLegSource(String legSource) {
		this.legSource = legSource;
	}
	
	public void showResult(){
		System.out.println(armSource +"로 만든 팔과"+ legSource + "로 만든 다리를 가진" + name);
	}
} //end Hero
