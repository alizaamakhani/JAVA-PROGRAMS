import java.awt.event.*;
import javax.swing.*;

class RButton{
    public static void main(String args[]){
        JFrame f = new JFrame("RADIO BUTTON");
        JRadioButton r1 = new JRadioButton("MALE");
        JRadioButton r2 = new JRadioButton("FEMALE");

        r1.setBounds(100,100,100,30);
        r2.setBounds(100,130,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b = new JButton("SUBMIT");

        b.setBounds(100,170,100,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(r1.isSelected())
                  JOptionPane.showMessageDialog(f, "Male Selected");


                if(r2.isSelected())
              JOptionPane.showMessageDialog(f, "FEMale Selected");



            }
        });
        f.add(r1);
                f.add(r2);
                f.add(b);

                        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    

    }
}