import java.awt.*;
import java.awt.event.*;

public class TextFieldExample {

    public static void main(String[] args) {

        Frame f = new Frame("TextField Example");

        Label l = new Label("Enter Name:");
        l.setBounds(50,100,80,30);

        TextField tf = new TextField();
        tf.setBounds(140,100,120,30);

        
Button b = new Button("Submit");
        b.setBounds(120,150,80,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Name: " + tf.getText());
            }
        });

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
