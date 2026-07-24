import java.awt.*;
import java.awt.event.*;

public class Choice1 {

    public static void main(String[] args) {

        Frame f = new Frame("Choice Example");

        Choice c = new Choice();

        c.setBounds(100,100,100,30);

        c.add("Java");
        c.add("Python");
        c.add("C++");

        Button b = new Button("SUBMIT");
        b.setBounds(100,150,80,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Selected:"+ c.getSelectedItem());
            }
        });

        f.add(c);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
