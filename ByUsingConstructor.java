import javax.swing.*;
class ByUsingConstructor
{
    ByUsingConstructor()
    {
        JFrame f=new JFrame("Jframe");
        JButton b=new JButton("Click");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        ByUsingConstructor b=new ByUsingConstructor();
    }
}