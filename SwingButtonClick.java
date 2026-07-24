import javax.swing.*;
import java.awt.event.*;

class SwingButtonClic{
    public static void main(String args[]){
        JFrame f = new JFrame("MY WINDOW");
        JButton b = new JButton("CLICK");

        b.setBounds(100,100,100,40);
       b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            System.out.println("BUTTON CLICKED!!");
                }
            });
            f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

        
       



        
    
