package Test2;

import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
class Tourapi_test{
 
 //요청할 API서비스 URL 지정(지역 코드 검색 API)
 private static String url = "http://api.visitkorea.or.kr/openapi/service";
 
 //파일에 byte[]를 저장하는 method
 public static void saveBytes(String fileName, byte[] byteData) throws Exception{
  FileOutputStream fo = null;
  try { 
   fo = new FileOutputStream(fileName); 
   fo.write(byteData);
  } finally{
    try { 
     fo.close(); 
     fo = null; 
    } catch(Exception e){} 
    
  } 
  
 }
  
 public static void main(String[] args){
  //QueryString 지정(지역코드는 서울, 시/군/구 코드는 중구, 읍/면/동 코드는 신당2동)
  url = url + "?code1=1&code2=24&code3=34&pageIndex=1&pageSize=10";  //<- 이 URL 코드 부분이 다르니 조정을 해야함. 
  //HttpClient 생성 
  HttpClient client = new HttpClient(); 
  //요청 Method 지정 
  HttpMethod method = new GetMethod(url); 
  String responseXML = ""; 
  method.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
  //사용자의 TourAPI 인증키 지정
  method.setRequestHeader("Authentication", "TA2012081313072775903561"); 
 // method.setRequestHeader("qewqsa", "6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D");
  
  
  try {
   System.out.println( "QueryString>>>" + method.getQueryString() ); 
   //Http 요청 및 요청 결과 
   int statusCode = client.executeMethod(method);
   System.out.println("HTTP status code : " + statusCode );
   
   //요청결과 
   if(statusCode == HttpStatus.SC_OK){ 
    
    System.out.println("=========================================================="); 
    System.out.println("요청 성공\n");
    //결과를 화면에 출력 
    responseXML = new String( method.getResponseBody(), "UTF-8" ); 
    System.out.println("응답 XML:\n" + responseXML); 
    System.out.println("==========================================================");
    //결과를 파일에 저장 
    Tourapi_test.saveBytes("responseXML.xml", method.getResponseBody());
    
   }else{
    System.err.println("Method failed: " + method.getStatusLine()); 
   }
  }catch (Exception e) {
   System.err.println("Fatal protocol violation: " + e.getMessage()); 
   e.printStackTrace();
  } finally { // Release the connection
   method.releaseConnection(); 
  
  } //try end 
  
 }//main end
  
 
}//TourApiTest calss end
 