package Test2;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
// import org.apache.commons.httpclient.methods.PostMethod;

public class Test_httmlcliect {

    public static void main(String[] args) {

        HttpClient httpclient = new HttpClient();
        GetMethod httpget = new GetMethod("http://api.visitkorea.or.kr/openapi/service"); //기존코드가 안됬던 이유는 엔딩코드가 다르기 때문이었다.
        																							   //http://tourapi.visitkorea.or.kr/TourAPI/services/code <- 이게 그거임
        // PostMethod httppost = new 
        // PostMethod("https://www.java2go.net/nopage.html");
        httpget.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        //사용자의 TourAPI 인증키 지정
        //httpget.setRequestHeader("Authentication", "6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D"); 
        httpget.setRequestHeader("qewqsa", "6tLZdNCgFtUUkC1aMEPPSDH5EqZB09HbJ9vEwO1DeRGItkpZQzyAxdTw2npenOfhIQdsklstTNt9qrj2RODhkQ%3D%3D");
        
        
        
        try {
            int statusCode = httpclient.executeMethod(httpget);

            System.out.println("Response Status Code: " + statusCode);
            System.out.println("Response Status Line: " + httpget.getStatusLine());
            System.out.println("Response Body: \n" 
                    + httpget.getResponseBodyAsString());

            if (statusCode == HttpStatus.SC_OK) {
                // if (statusCode >= 200 && statusCode < 300) {
                System.out.println("Success!");
            } else {
                System.out.println("Fail!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpget.releaseConnection();
        }
    }
}