package designPattern.chainOfResponsibility;

public class Casanova extends Expert {
	public Casanova() {
		expertName ="카사노바";
	}

	@Override
	protected boolean solve(Problem p) {
		return p.getProblemName().contains("여자") || p.getProblemName().contains("여성");
	}

}
