package designPattern.proxy;

public class CommandExecutorProxy implements CommandExecutor{

	private boolean isAdmin;
	private CommandExecutor executor;
	
	
	public CommandExecutorProxy(String user, String pwd){
		if("seotory".equals(user)&&"pw".equals(pwd)){
			isAdmin = true;
			
		}
		
		executor = new CommandExecutorImpl();
	}
	
	
	@Override
	public void runComamnd(String cmd) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("test2");
		if(isAdmin){
			executor.runComamnd(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm is only admin");
			}else{
				executor.runComamnd(cmd);
			}
		}
		
	}
	
	

}
