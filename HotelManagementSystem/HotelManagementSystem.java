package HotelManagementSystem;
import javax.swing.*;


public class HotelManagementSystem extends JFrame {

    HotelManagementSystem(){
        setSize(1366 ,565 );
        setLocation(100,100);
        //to set image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/hotel.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        setVisible(true);
    }
    public static void  main(String[]args){
        new HotelManagementSystem();
    }
}