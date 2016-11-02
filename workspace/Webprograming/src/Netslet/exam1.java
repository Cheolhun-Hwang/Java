/**
 * 파일명 : exam1.java
 * 작성일 : 2016. 7. 17.
 * 파일설명 :
 */
package Netslet;
//tomcat을 이용하여  net server luncher 의 기능을 한다
import java.io.File;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
	 
public class exam1 {
	    public static void main(String[] args) throws Exception {
	        String webappDirLocation = "webapp/";
	        Tomcat tomcat = new Tomcat();
	        String webPort = System.getenv("PORT");
	        if(webPort == null || webPort.isEmpty()) {
	            webPort = "9999";
	        }
	         
	        tomcat.setPort(Integer.valueOf(webPort));
	        Connector connector = tomcat.getConnector();
	        connector.setURIEncoding("UTF-8");
	        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
	        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());
	        tomcat.start();
	        tomcat.getServer().await(); 
	    }
}
