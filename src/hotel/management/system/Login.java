
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    
        JTextField username,passward;
        JButton login,cancel;
    
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        
        JLabel user = new JLabel("USERNAME");
        user.setBounds(40,20,100,30);
        add(user);
        
        
         username =new JTextField();
        username.setBounds(180,20,100,25);
        add(username);
         
        
        
        JLabel pass= new JLabel("PASSWARD");
        pass.setBounds(40,70,100,30);
       add(pass);
        
       
       passward =new JTextField();
        passward.setBounds(180,70,100,25);
        add(passward);
         
        login= new JButton("LOGIN");
        login.setBounds(40,150,120,30);
        login.setBackground(Color.darkGray);
        login.setForeground(Color.white);
        login.addActionListener(this);
       add(login);
        
        cancel= new JButton("CANCEL");
        cancel.setBounds(180,150,120,30);
        cancel.setBackground(Color.darkGray);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
       
   
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
     Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     
     JLabel image = new JLabel(i3);
       image.setBounds(350,20,200,170);
       add(image);
       
       
        
        
    setBounds(500,200,600,300);
    setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
           String user= username.getText();
           String pass= passward.getText();
           
           try{
           Conn c= new Conn();
           
           String query = "SELECT * FROM login WHERE username = '" + user + "' AND passward = '" + pass + "'";

           
          ResultSet rs= c.s.executeQuery(query);
          if(rs.next()){
          setVisible(false);
          new Dashboard();
          
          }else{
               JOptionPane.showMessageDialog(null,"Invalid username or passward");
          }
          }catch(Exception e ){
          e.printStackTrace();
          }
           
         }else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
        
    }
    
    public static void main(String args[]){
     new Login();
    
    }
}
