
import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 2019-01-23 raongang
 * @author admin
 * 
 * java-json.jar필요함.
 *
 */
public class FindClassesFromJar2 {
	
	public static void main(String[] args){
		
		//class를 검색할 jar파일 경로
		String jarDir = "C:/TimeStamp/eclipse/sts/gitJavaExam/ReflectionExam/lib/etimeutil.jar";
		JSONObject myList = getCrunchifyClasNameFromJar(jarDir);
		
		System.out.println(myList);
	}

	public static JSONObject getCrunchifyClasNameFromJar(String crunchifyJarName) {
		// TODO Auto-generated method stub
		
		JSONArray listofClasses = new JSONArray();
		JSONObject crunchifyObject = new JSONObject();
		
		
		try {
			//모든 입력스트림에서 jar파일을 읽기 위해 사용된다.
			JarInputStream crunchifyJarFile = new JarInputStream(new FileInputStream(crunchifyJarName));
			JarEntry crunchifyJar;
			
			while(true){
				crunchifyJar = crunchifyJarFile.getNextJarEntry();
				if (crunchifyJar == null) {
					break;
				}
				
				if ((crunchifyJar.getName().endsWith(".class"))) {
					String className = crunchifyJar.getName().replaceAll("/", "\\.");
					String myClass = className.substring(0, className.lastIndexOf('.'));
					
					
					listofClasses.put(myClass);
				}				
			}
			crunchifyObject.put("Jar File Name", crunchifyJarName);
			crunchifyObject.put("List of Class", listofClasses);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return crunchifyObject;
	}//end method
}//end class
