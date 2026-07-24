import java.awt.event.*;

import javax.swing.*;
class CheckBoxExample{
    public static void main(String args[]){
        JFrame f= new JFrame("CHECKBOX EXAMPLE");
        JCheckBox c1 = new JCheckBox("java");
        JCheckBox c2 = new JCheckBox("python");

        c1.setBounds(100,100,100,30);
        c2.setBounds(100,130,100,30);

        JButton b = new JButton("SUBMIT");
        b.setBounds(100,170,100,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String msg= "";
if(c1.isSelected())
    msg = msg+"java";
if(c2.isSelected())
    msg = msg+"python";
                JOptionPane.showMessageDialog(f, "Selected: " + msg);
               
            }
        });
         f.add(c1);
                f.add(c2);
                f.add(b);

                        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    


    }
}
