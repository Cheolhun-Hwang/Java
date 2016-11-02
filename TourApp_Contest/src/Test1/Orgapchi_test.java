package Test1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.params.SyncBasicHttpParams;
import org.apache.http.protocol.HTTP;

@SuppressWarnings("deprecation")
public class Orgapchi_test {
/**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  HttpParams params     =    new SyncBasicHttpParams();   
  
  HttpClient httpClient   =   new DefaultHttpClient(params);
  
  
  InputStream in     =   null;
  StringBuffer sb     =   new StringBuffer();
  try{
   HttpPost httpPost   =   new HttpPost("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=인증키&contentTypeId=38&areaCode=1&sigunguCode=&cat1=A04&cat2=A0401&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=12&pageNo=1");
   
   //HttpGet httpPost   =   new HttpGet("http://211.63.6.75:8084/cms_developer_poc/product/CategoryList?CONTENT_CATEGORY_ID=cat12011616290669");
   // if get method use
   
   
   //****************************************
   //header setting
   //****************************************
   httpPost.addHeader("user-agent","incross0101");
   
   Header[] reqHeaders   =   httpPost.getAllHeaders();
   
   for(int i=0;i<reqHeaders.length;i++){
    System.out.println("request header::"+reqHeaders[i].getName()+"::::"+reqHeaders[i].getValue());
   }
   //**************************************************
   //body parameter setting(only post method)
 List<NameValuePair> pair =   new ArrayList<NameValuePair>();
   new BasicNameValuePair("CONTENT_CATEGORY_ID", "cat12011616290669");
   UrlEncodedFormEntity ent =   new UrlEncodedFormEntity(pair,HTTP.UTF_8);
   
   
   httpPost.setEntity(ent);
   //**************************************************
   
   
   //**************************************************
   //resonse header setting
   
   HttpResponse response  =   httpClient.execute(httpPost);
   
   Header[] resHeaders   =   response.getAllHeaders();
   
   for(int i=0;i<resHeaders.length;i++){
    System.out.println("response header::"+resHeaders[i].getName()+"::::"+resHeaders[i].getValue());
   }
   //**************************************************
   
   
   HttpEntity responseEntity =   response.getEntity();
   
   in       =   responseEntity.getContent();
   if(response.getStatusLine().getStatusCode()==200){
    
    BufferedReader reader =   new BufferedReader(new InputStreamReader(in,"UTF-8"));
    
    
    
    String line    =   "";
    
    while((line = reader.readLine())!=null){
     sb.append(line+"\n");
    }
    in.close();
   }else{
    System.out.println("error : "+response.getStatusLine().getStatusCode());
   }
   
   System.out.println(sb.toString());
   
   if(in!=null){
    in.close();
   }
  }catch(Exception e){
   e.printStackTrace();
  }finally{
   httpClient.getConnectionManager().shutdown();
   //connection close
  }
     
     
  
 }
}