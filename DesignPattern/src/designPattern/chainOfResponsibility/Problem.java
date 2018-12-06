package designPattern.chainOfResponsibility;

//---------- 전문가들이 풀어야 할 문제 class ---------- 
public class Problem {
	private String problemName;
	
	public Problem(String name){
		this.problemName = name;
	}
	
	public String getProblemName(){
		return problemName;
	}
}
