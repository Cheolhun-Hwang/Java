package Test1;

import java.io.*;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
 
// XML 파서
import javax.xml.parsers.*;
import org.w3c.dom.*;
 
//Get Method를 사용한 예제
public class TourApi{
 //요청할 API서비스 URL 지정(지역 코드 검색 API)
  
  private static String url = "";
  
  //파일에 byte[]를 저장하는 method 
  public static void saveBytes(String fileName, byte[] byteData) throws Exception{ 
   FileOutputStream fo = null;
   try { 
    fo = new FileOutputStream(fileName); 
    fo.write(byteData); 
   } finally{ 
    try { 
     fo.close(); fo = null; 
   } catch(Exception e){} 
  } 
 }
	  
  public static void save_text(String xmlpaxing, int page){			
		 String txt = "[pagenambe : " + page + "\nxmlconde : " + xmlpaxing+"\n]";			//저장형식 지정
   String fileName = "/home/hch/xml_paxing_exam.txt";	//텍스트 파일 저장할 위치
    
    try{
    	 File wfile = new File(fileName);
        BufferedWriter fw = new BufferedWriter(new FileWriter(wfile, true));// BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
        fw.write(txt);// 파일안에 문자열 쓰기
        fw.flush();  
        fw.close(); // 객체 닫기  
    }catch(Exception e){
        e.printStackTrace();
    }
	}
 
 
  
  public static void main(String[] args) {

  //url = url + "?code1=1&code2=24&code3=34&pageIndex=1&pageSize=10";
	  for(int count = 1 ; count < 100;count++){
  url = url + "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D&contentTypeId=32&areaCode=1&sigunguCode=&cat1=B02&cat2=B0201&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=12&pageNo="+count;
  
  
  //HttpClient 생성 
  HttpClient client = new HttpClient(); 
 
  //요청 Method 지정 
  HttpMethod method = new GetMethod(url); 
  String responseXML = ""; 
  
  method.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
  
  //사용자의 TourAPI 인증키 지정
  //method.setRequestHeader("qewqsa", "6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D");
  //method.setRequestHeader("Authentication", "TA2012081313072775903561");
  //method.setRequestHeader("Authentication", "6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D");
  
  try { 
	//System.out.println( "QueryString>>>" + method.getQueryString() ); 
 
   //STEP.1 Http 요청 및 요청 결과
   int statusCode = client.executeMethod(method); 
   System.out.println("HTTP status code : " + statusCode );
   
   //요청결과
   if(statusCode == HttpStatus.SC_OK){ 
    System.out.println("=========================================================="); 
    System.out.println("요청 성공\n");
   
    //STEP.2 결과를 화면에 출력
    responseXML = new String( 
     method.getResponseBody(), "UTF-8" 
    ); 
     
    if(responseXML.indexOf("<item>")>0){
    	//System.out.println("응답 XML:\n" + responseXML); //받은 xml을 확인하기 위한 코드	
    	//System.out.println(url);
    	TourApi.save_text(responseXML, count);  //파일저장하기 위한 코드로 나중에 검사 이후 지우기;
    	url = "";
    	responseXML = "";
    }else{
    	System.out.println("모든 요청 처리 완료");
    	break;
    }
    
   }else { 
    System.err.println("Method failed: " + method.getStatusLine()); 
   }
  
  } catch (Exception e) { 
   System.err.println("Fatal protocol violation: " + e.getMessage()); e.printStackTrace(); 
  } finally { 
   // Release the connection
   method.releaseConnection();
  } //try end
	  }//for end
 } //main end 
} //TourAPISample end

 