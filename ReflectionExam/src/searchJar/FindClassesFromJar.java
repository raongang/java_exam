package searchJar;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 2019-01-23 raongang
 * @author admin
 * 
 *  java-json.jar가 필요하다.
 *
 */

public class FindClassesFromJar {
	
	public static void main(String[] args){
		
		//class를 검색할 jar파일 경로
		String jarDir = "C:/TimeStamp/eclipse/sts/gitJavaExam/ReflectionExam/lib/etimeutil.jar";
		 
		JSONObject myList = getCrunchifyClasNameFromJar(jarDir);
		
		//System.out.println(myList);
	}
	
	//inside jar class추출 method
	public static JSONObject getCrunchifyClasNameFromJar(String jarDir) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		JSONArray listofClasses = new JSONArray();
		JSONObject crunchifyObject = new JSONObject();
		
		//initialize
		FileInputStream fis = null;
		JarInputStream jis = null;
		JarEntry jarEntry;
		
		try {
			//모든 입력스트림에서 jar파일을 읽기 위해 사용된다.
			
			fis = new FileInputStream(jarDir);
			jis = new JarInputStream(fis);
			
			while(true){
				jarEntry = jis.getNextJarEntry();
				
				if (jarEntry == null) {
					break;
				}
				
				//class파일을 찾아서 
				if ((jarEntry.getName().endsWith(".class"))) {
					//replaceAll[기존문자,바꿀문자]
					String classFullpath = jarEntry.getName().replaceAll("/", "\\.");
					
					//클래스이름만 파싱
					//String className = classFullpath.substring(0, classFullpath.lastIndexOf('.'));
					
					list.add(classFullpath);
					
					//listofClasses.put(myClass);
				}				
			}//end while
			
			
			/* print
			Iterator<String> iter = list.iterator();
			while(iter.hasNext()) {
			    //System.out.println(iter.next());

			}*/
			
			//crunchifyObject.put("Jar File Name", crunchifyJarName);
			//crunchifyObject.put("List of Class", listofClasses);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null) { 
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}//end if
			
			if(jis!=null) {
				try {
					jis.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}//end if
			
			
		}//end finally
		return null;
		//return crunchifyObject;
	}//end method
}//end class
