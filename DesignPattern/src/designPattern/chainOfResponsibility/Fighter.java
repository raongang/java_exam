package designPattern.chainOfResponsibility;

// -------- 첫번째 전문가 파이터1 --------
public class Fighter extends Expert {
	public Fighter(){
		this.expertName = "격투가";
	}

	@Override
	protected boolean solve(Problem p) {
		// TODO Auto-generated method stub
		return p.getProblemName().contains("깡패");
	}
}
