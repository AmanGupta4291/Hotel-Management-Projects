package hotel.management.system;
import javax.swing.*;
import java.awt.*;


public class Dashboard extends JFrame{
    
     Dashboard(){
    setBounds(0,0,1550,1000);
    
    
    setLayout(null);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
    Image i2=i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(0,0,1550,1000);
    add(image);
    
    
    JLabel text =new JLabel("THE TAJ GROUP WELCOMES YOU");
    text.setBounds(400,80,1000,50);
    text.setFont(new Font("Tahoma",Font.PLAIN,45));
    text.setForeground(Color.WHITE);
    image.add(text);
    
   JMenuBar mb= new JMenuBar();
   mb.setBounds(0,0,1550,30);
   image.add(mb);
   
   JMenu Hotel =new JMenu("HOTEL MANAGEMENT");
   Hotel.setForeground(Color.red);
   mb.add(Hotel);
   
   JMenuItem reception =new JMenuItem("Reception");
   Hotel.add(reception);
   
   JMenu admin =new JMenu("ADMIN");
   admin.setForeground(Color.BLUE);
   mb.add(admin);
   
   JMenuItem addemployee = new JMenuItem("Add Employee");
   admin.add(addemployee);
   
   JMenuItem addrooms = new JMenuItem("Add Rooms");
   admin.add(addrooms);
   
   JMenuItem adddrivers = new JMenuItem("Add Drivers");
   admin.add(adddrivers);
   
   
   
    
    
    setVisible(true);
    }
    
     public static void main(String []args){
     new Dashboard();
     
     }
}
