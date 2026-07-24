import javax.swing.*;
 class SwinExample{
    public static void main(String args[]){
       JFrame f = new JFrame("MY FIRST WINDOW");
       JButton b = new JButton("CLICK ME");
       b.setBounds(100,100,100,40);
       f.add(b);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
    }
}