import javax.swing.*;
class LabelExample {
    public static void main(String args[]){
        JFrame f = new JFrame("LABEL EXAMPLE");
        JLabel l = new JLabel("HELLO JAVA");
        l.setBounds(100,100,100,40);
         f.add(l);
  f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

    
