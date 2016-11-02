/*package database_exam;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
 
public class DB_exam extends JFrame{
 
Container con;
static JTextField tx1,tx2,tx3;
    
    public DB_exam() {
        
        con = this.getContentPane();
        con.setLayout(new FlowLayout());
        
        JLabel name = new JLabel("이름");
        this.tx1 = new JTextField(10);
        JLabel tel = new JLabel("전화번호");
        this.tx2 = new JTextField(10);
        JLabel email = new JLabel("이메일");
        this.tx3 = new JTextField(10);
        
        JButton submit = new JButton("입력");
        JButton search = new JButton("조회");
        
        JPanel p1 = new JPanel();
        p1.add(name);
        p1.add(tx1);
        p1.add(tel);
        p1.add(tx2);
        p1.add(email);
        p1.add(tx3);
        JPanel p2 = new JPanel();
        p2.add(submit);
        p2.add(search);
    
        con.add(p1,BorderLayout.CENTER);
        con.add(p2,BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,150);
        this.setLocation(800,300);
        this.setVisible(true);
        
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println(tx1.getText()+"의 연락처가 입력되었습니다.");
                
                String str;
                str = "이름 : "+tx1.getText()+", 전화번호 : "+tx2.getText()+", 이메일 : "+tx3.getText();
                System.out.println(str);
                
                try{
                    String input1 = tx1.getText().toString();
                    String input2 = tx2.getText().toString();
                    String input3 = tx3.getText().toString();
                    Connection conn = null;
                    Statement stmt = null;
                    String url = "jdbc:oracle:thin:@localhost:1521:XE";
                    String user = "STD01";
                    String passwd = "std01";
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = DriverManager.getConnection(url, user, passwd);
                    stmt =  conn.createStatement();
                    String sql ="insert into Person values(Person_seq.NEXTVAL, '"+input1+"', '"+input2+"','"+input3+"')";
                    //String sql = "update Person set phone='01066666666' where id=2";
                    //String sql = "delete from Person where id =2";
                    stmt.executeUpdate(sql);
                    
                    System.out.println("update finish");
                    conn.close();
                    stmt.close();
                    System.out.println("입력성공");
                }catch(Exception f){
                    System.out.println("입출력 오류");
                }
            }
        });
    */
 
        /* DB autoincreasing 하는법
         * sql에 다음을 입력하세요.
         * create sequence Person_seq 
            start with 2
            increment by 1
            maxvalue 100
            cycle nocache
            다음에 insert 할때 autoincreasing 하고싶은 부분 (ex. id)에 Person_seq.NEXTVAL을 입력하면 됩니다!
            ;*/
       /* search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                String user = "STD01";
                String passwd = "std01";
                
                try{
                
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = DriverManager.getConnection(url, user, passwd);
                    stmt =  conn.createStatement();
                    String sql = "select * from Person order by id asc";    //문자열
                    rs = stmt.executeQuery(sql);    //실행
                    
                    while(rs.next()){
                        String id = rs.getString(1);
                        String name = rs.getString(2);
                        String phone = rs.getString(3);
                        String email = rs.getString(4);
                        System.out.println("id = "+id+", name = "+name+", phone = "+phone+", email = "+email);
                    }
                    
                    //자원닫기
                    conn.close();
                    stmt.close();
                    rs.close();
                }catch(Exception f){
                    System.out.println("입력오류");
                    f.printStackTrace();
                }
                
            }
        });
    
    }
    */
  /*  public static void main(String[] args) {
        
        DBserach app = new DBserach();*/
        
        /*try{
            Connection conn = null;
            Statement stmt = null;
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "STD01";
            String passwd = "std01";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, passwd);
            stmt =  conn.createStatement();
            String sql ="insert into Person values(3, '"+input1+"', '"+input2+"','"+input3+"')";
            //String sql = "update Person set phone='01066666666' where id=2";
            //String sql = "delete from Person where id =2";
            stmt.executeUpdate(sql);
            System.out.println("update finish");
            conn.close();
            stmt.close();
            System.out.println("입력성공");
        }catch(Exception e){
            System.out.println("입력 error");
            e.printStackTrace();
        }*/
 /*   }
 
    
}
*/
