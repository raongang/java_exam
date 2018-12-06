package designPattern.proxy;

public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runComamnd(String cmd) throws Exception {
		
		System.out.println("test");
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println("cmd : " + cmd);
	}
	
}
