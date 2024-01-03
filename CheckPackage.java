package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{
    CheckPackage() {
    setBounds(450, 200, 900, 600);
       
//    String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance", "Half Day City Tour", "Daily Bucket", "Soft Drinks Free", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK PACKAGE", "SUMMER SPEACIAL", "Rs 12000/-", "package1.jpg"};
//    String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Airport", "Welcome Drinks on Arrival", "Night Safari", "Cruise with Dinner", "BOOK NOW", "WINTER SPEACIAL", "Rs 24000/-", "package2.jpg"};
//    String[] package3 = {"BRONZE PACKAGE", "6 Days and 5 Nights", "Return Airfare", "Free Clubing", "Horse Riding & other Games", "Hard Drinks Free", "Daily Bucket", "BBO Dinner", "BOOK NOW", "WINTER SPEACIAL", "Rs 32000/-", "package3.jpg"};

    JTabbedPane tab = new JTabbedPane();
           

    
    
    
    
//    JPanel p1 = createPackage(package1);
    tab.addTab("Package 1", null, p1);
//
//    JPanel p2 = createPackage(package2);  // Pass package2 details
//    tab.addTab("Package 2", null, p2);
//
//    JPanel p3 = createPackage(package3);  // Pass package3 details
//    tab.addTab("Package 3", null, p3);
//
    
//
//}
//   
        
      
   
    
    tab.addTab("Package 1",null,p1);
    tab.addTab("Package 2",null,p1);
    tab.addTab("Package 3",null,p1);
    
    add(tab);

    setVisible(true);
   

   }
    
       public JPanel createPackage(){
            JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

                    JLabel l1 = new JLabel("GOLD PACKAGE");
    l1.setBounds(50, 5, 300, 20);
    l1.setForeground(Color.BLACK);
    l1.setFont(new Font("Tahoma", Font.BOLD, 30) );
    p1.add(l1);
    
    JLabel l2 = new JLabel("6 Days and 7 Nights");
   l2.setBounds(30, 60, 300, 20);
   l2.setForeground(Color.RED);
    l2.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l2);
   
    JLabel l3 = new JLabel("Airport Assistance");
    l3.setBounds(30, 110, 300, 20);
    l3.setForeground(Color.BLUE);
    l3.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l3);
    
     JLabel l4 = new JLabel("Half Day City Tour");
    l4.setBounds(30, 160, 300, 20);
    l4.setForeground(Color.RED);
    l4.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l4);
    
    JLabel l5 = new JLabel("Daily Buffet");
    l5.setBounds(30, 210, 300, 20);
    l5.setForeground(Color.BLUE);
    l5.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l5);
    
    JLabel l6 = new JLabel("Welcome Drinks on Arrival");
    l6.setBounds(30, 260, 300, 20);
    l6.setForeground(Color.RED);
    l6.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l6);
    
    JLabel l7 = new JLabel("Full Dat 3 island Cruise");
    l7.setBounds(30, 310, 300, 20);
    l7.setForeground(Color.BLUE);
    l7.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l7);
    
     JLabel l8 = new JLabel("English Speaking Guide");
    l8.setBounds(30, 360, 300, 20);
    l8.setForeground(Color.RED);
    l8.setFont(new Font("Tahoma", Font.BOLD, 20) );
    p1.add(l8);
    
    JLabel l9 = new JLabel("Book Now");
    l9.setBounds(60, 430, 300, 20);
    l9.setForeground(Color.BLACK);
    l9.setFont(new Font("Tahoma", Font.BOLD, 25) );
    p1.add(l9);
    
    JLabel l10 = new JLabel("Summer Special");
    l10.setBounds(60, 480, 300, 20);
    l10.setForeground(Color.BLACK);
    l10.setFont(new Font("Tahoma", Font.BOLD, 25) );
    p1.add(l10);
    
    JLabel l11 = new JLabel("Rs 12000/-");
    l11.setBounds(500, 480, 300, 20);
    l11.setForeground(Color.BLACK);
    l11.setFont(new Font("Tahoma", Font.BOLD, 25) );
    p1.add(l11);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
    Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l12 = new JLabel(i3);
    l12.setBounds(350,20,500,300);
    p1.add(l12);
        return p1;
       }

public static void main(String[] args) {
new CheckPackage();
} 
}
