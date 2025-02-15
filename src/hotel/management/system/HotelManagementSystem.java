package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem(){
        setSize(1366,565);
        setLocation(100,100);
        setBounds(0,0,1366,565);
        
        
      
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        
        
        JLabel text =new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,430,1000,90);
        text.setForeground(Color.red);
        text.setFont(new Font("serif",Font.ITALIC,50));
        image.add(text);
        
       JButton  next =new JButton("NEXT");
       next.setBounds(1150, 450,150, 50);
       next.setForeground(Color.red);
       next.addActionListener(this);
       next.setFont(new Font("serif",Font.ITALIC,24));
       image.add(next);
        
        setVisible(true);
        
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(800);
            }catch(Exception e){
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
   
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
