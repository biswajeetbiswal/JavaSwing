import javax.swing.*;
class Jframe1
{
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        JButton b=new JButton("click");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setTitle("Jframe window");
        f.setVisible(true);
    }
}