package designPattern.Mediator;

//-- 착륙허가를 받아야 하는 Airplane --
public class Airplane extends Thread{
	private final ControlTower tower;
	private final int seq;
	
	public Airplane(ControlTower tower, int seq) {
		super();
		this.tower = tower;
		this.seq = seq;
	}
	
	public int getSeq(){
		return seq;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try{
			while(!tower.getPermission()){
				//System.out.println(seq+"번 째 비행기 대기 중");
				Thread.sleep(10L);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	
	
	
	
}
