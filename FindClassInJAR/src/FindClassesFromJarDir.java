
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * 2019-01-23 
 * @author raongang
 *  
 *  동작방식
 *   1) 검색할 디렉토리를 설정한다
 *   2) 검색할 class파일을 설정한다 
 *     2-1) class명.class 확장자까지 기입해야 함.
 *   3) 해당 디렉토리를 돌면서 하위디렉토리여부를 체크한다
 *     3-1) 하위디렉토리면 다시 하위디렉토리를 서치한다
 *     3-2) 디렉토리가 아닐 경우 .jar파일을 서칭한다
 *   4) jar파일을 읽어서 class파일을 추출하여 list에 jar경로!class명으로 저장한다.
 *   5) 4)에서 저장된 list를 가지고 검색할 class파일을 서칭한다. 이때 ! 구분자를 기준으로 해당하는
 *      jar명과 class파일을 나누어 표시한다.
 *   
 */

public class FindClassesFromJarDir {
	
	//재귀함수때문에 전체를 저장할 list를 선언
	
	public static List<String> classInfo = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		//class를 검색할 jar파일 경로
		//String jarDir = "C:/lib";
		//search class 변수
		//String searchClassName ="etiming.log4j.EtimePrintOut.class";
		
		String jarDir= null;
		String searchClassName = null;
		
		//인자값 처리 
		/*
		if(args.length == 0 || args.length<2) {
			System.out.println("usage : java FindClassesFromJar <JAVA DIRECTORY PATH> <search class file name>");
			System.out.println();
			System.out.println(" JAVA DIRECTORY PATH    - JAR파일이 있는 디렉토리위치");
			System.out.println(" SEARCH CLASS FILE NAME - 검색할 CLASS파일 이름");
			System.out.println(" ex) - java FindClassesFromJar c:/lib etiming.log4j.EtimePrintOut.class");
			System.exit(1);
		}else{
			jarDir = args[0];
			searchClassName = args[1];
			
			System.out.println("jarDir : " + jarDir);
			System.out.println("searchClassName : " + searchClassName);
		}*/
		
		
		jarDir = "C:/lib";
		searchClassName = "etiming.log4j.EtimePrintOut.class";
		
		
		
		//jar파일경로의 jar속 클래스 리스트를 추출한다.
		try {
			getJarDirectory(jarDir);
			//클래스속 파일을 서칭한다
			getSearchJarClass(classInfo,searchClassName);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** 지정된 경로의 jar파일들을 검색한다. 재귀사용 */
	private static void getJarDirectory(String jarDir) throws Exception{
		String pathInfo = null;
			File file = new File(jarDir);
			File[] files = file.listFiles();
			
			for(int i=0; i<files.length;i++) {
				File tempFile = files[i];
				pathInfo = tempFile.getCanonicalPath().toString();
				//디렉토리일 경우에는 하위디렉토리로 들어간다.
				if(tempFile.isDirectory()) {
					getJarDirectory(pathInfo); //재귀함수
				}else {
					//디렉토리가 아닐 경우, jar파일을 검색하고 class추출 메소드를 호출한다.
					if(pathInfo.endsWith(".jar")) {
						getCrunchifyClasNameFromJar(pathInfo);
					}
				}//end else
			}//end for
	}//end getJarDirectory method
	
	/** inside jar class추출 method */
	private static void getCrunchifyClasNameFromJar(String jarDir) {
		// TODO Auto-generated method stub
		
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
					
					//클래스이름을 list에 저장한다.
					classInfo.add(jarDir+"!"+classFullpath);
				}				
			}//end while
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
	}//end method
	
	
	/** Jar속 class서칭 기능 */ 
	private static void getSearchJarClass(List<String> classInfo, String _searchClassName) {
		// TODO Auto-generated method stub
		
		Iterator<String> iter = classInfo.iterator();
		System.out.println("====[getSearchJarClass]class list size : " + classInfo.size());
		//directory class print
		//System.out.println("==== [getSearchJarClass] class list");
		
		String jarname = null;
		String classname = null;
		
		/* 임시주석 */
		while(iter.hasNext()) {
			String temp = iter.next();
			//System.out.println(temp);
			
			//jar명과 class를 분리한다.
			int index = temp.indexOf("!");
			jarname = temp.substring(0,index);
			classname = temp.substring(index+1);
			
			if(classname.equals(_searchClassName)) { // a.class <ㅡ 이렇게 검색할 경우
				System.out.println("Search Success [Jar : " + jarname + " / classname : " + classname + "]");
			}else { //찾지 못할 경우

			}
		}//end while
	}//end getSearchJarClass method
	
}//end class
