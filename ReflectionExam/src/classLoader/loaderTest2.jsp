
<%@ page contentType="text/html;charset=UTF-8"%>

<%@ page import="java.io.File"%>
<%@ page import="java.net.URI"%>

<%@ page import="java.io.FileFilter"%>
<%@ page import="java.lang.reflect.Method"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.net.URLClassLoader"%>

<%
		String dir = "C:/TimeStamp/eclipse/sts/workspace/PDFJSP/WebContent/WEB-INF/lib";
		try{
			final URLClassLoader loader = (URLClassLoader)ClassLoader.getSystemClassLoader();
			
			final Method method = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
			method.setAccessible(true); //protected를 public으로 변환 
			
			new File(dir).listFiles(new FileFilter() {
				public boolean accept(File jar) {
					// jar 파일인 경우만 로딩
					if( jar.toString().toLowerCase().contains(".jar") ){
						try{
							// URLClassLoader.addURL(URL url) 메소드 호출
							method.invoke(loader, new Object[]{jar.toURI().toURL()});
							System.out.println(jar.getName()+ " is loaded.");
						}catch(Exception e){
							System.out.println(jar.getName()+ " can't load.");
						}
					}
					return false;
				}
			});
		}catch(Exception e){
			throw new RuntimeException(e);
		}
%>
