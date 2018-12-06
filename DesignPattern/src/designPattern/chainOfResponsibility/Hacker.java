package designPattern.chainOfResponsibility;

public class Hacker extends Expert {
	public Hacker() {
		this.expertName = "해커";
	}

	@Override
	protected boolean solve(Problem p) {
		return p.getProblemName().contains("컴퓨터");
	}

}
