package designPattern.proxy;

import sun.nio.cs.ext.EUC_CN;

public class ProxyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandExecutor executor = new CommandExecutorProxy("seotory", "is_not_pw");
		
		try{
			executor.runComamnd("ls -al");
			executor.runComamnd("rm -rf");
		}catch(Exception e){
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
