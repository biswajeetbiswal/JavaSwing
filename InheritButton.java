import javax.swing.*;
class InheritButton extends JFrame
{
    InheritButton(){
        JButton b=new JButton("Click me");
        b.setBounds(100,80,100,30);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new InheritButton();
    }
}