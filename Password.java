import javax.swing.*;
class Password
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("It is a frame");
        JPasswordField p=new JPasswordField();
        JLabel l=new JLabel("Password");
        l.setBounds(20,100,100,30);
        p.setBounds(100,100,100,30);
        f.add(p);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}