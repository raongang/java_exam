package designPattern.chainOfResponsibility;

// ---------- 전문가  : 상위 클래스  ----------
public abstract class Expert {
	
	private Expert next;
	protected String expertName;
	
	protected abstract boolean solve(Problem p);
	
	public final void support(Problem p) { 
		if(solve(p)){
			System.out.println(expertName +"이(가)" + p.getProblemName() + "을(를) clear");
		}else{
			if(next != null) { 
				next.support(p);
			}else{
				System.out.println(p.getProblemName() +"은(는) 해결할 넘이 없다.");
			}
		}
	}//end support 
	
	public Expert setNext(Expert next) { 
		this.next = next;
		return next;
	}
}
