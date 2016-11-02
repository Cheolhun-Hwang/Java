package Test2;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
class Tourapi_test2{
 
 //요청할 API서비스 URL 지정(지역 코드 검색 API)
 private static String url = "http://api.visitkorea.or.kr/openapi/service/";  //<- 기존 엔딩 URL 변동 했음.
  
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
  String searchtype;
  int code1;
  int code2;
  int reqType;
  int type;
  int pageIndex;
  int pageSize;
  String cat3;
  String mapX;
  String mapY;
  String radius;
  String contentId;
  String defaultYN;
  String overviewYN;
  //QueryString 지정
  // 1. 지역기반 통합 검색
  // "reqType=1 : 지역기반 검색
  // code1 =31 & code2 = 15: 경기도 안산시
  // type =32 : 숙박시설 
  // cat3 = B020109009 : 모텔
  // 이 요청은 경기도 안산시에 존재하는 모텔의 리스트
  // 검색타입
//  searchtype = "union?";
//  code1 = 1;
//  code2 = 15;
//  reqType= 1;
//  type = 32;
//  cat3 = "B02010900";
//  pageIndex = 1;
//  pageSize = 20;
//  url = url +searchtype+ "reqType="+reqType+"&code1="+code1+"&code2="+code2+"&type="+
//     type+"&cat3="+cat3+"&pageIndex="+pageIndex+"&pageSize="+pageIndex;
//  
  // 2. 위치기반 통합 검색
  // reqType=2 : 위치기반 통합 검색
  //mapX=126.9736942473691&mapY=37.565833000808574 : 좌표 (덕수궁 미술관)
  //radius=500 : 반경 500미터
  //type=12 : 관광지
  //cat3=A02020700 : 휴향 광광지 공원
  searchtype = "union?";
  url = url + searchtype +"reqType=2&mapX=126.9736942473691&mapY=37.565833000808574&radius=500&type=12&cat3=A02020700&pageIndex=1&pageSize=20";
  
  // 3. 상세정보 요청 
  // contentId=129507 
  // 
  //searchtype = "detail?";
  //url = url +searchtype+ "contentId=129507&defaultYN=Y&overviewYN=Y";
  
  //HttpClient 생성 
  HttpClient client = new HttpClient(); 
  //요청 Method 지정 
  HttpMethod method = new GetMethod(url); 
  String responseXML = ""; 
  method.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
  //사용자의 TourAPI 인증키 지정
  method.setRequestHeader("qewqsa", "6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D"); 
  
  
  
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
    Tourapi_test2.saveBytes("responseXML.xml", method.getResponseBody());
    
   }else{
	   System.out.println("요청 실패");
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
 
