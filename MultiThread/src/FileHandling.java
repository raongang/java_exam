import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
	public void fileWrite() {
		//FileRead 
		try {
			FileReader freader = new FileReader("c:/log/jmeter.txt");
			BufferedReader breader = new BufferedReader(freader);
			
			String data="";
			while((data=breader.readLine())!=null){
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}	
	}//end method
}
