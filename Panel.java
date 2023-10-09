import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Panel
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("panel example");
        JTextField tf=new JTextField();
        tf.setBounds(10,10,120,30);
        JPanel p=new JPanel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.red);
        JButton b1=new JButton("Button1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.green);
        JButton b2=new JButton("Button2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.blue);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Welcome to the panel");
            }
        });
        p.add(b1);
        p.add(b2);
        f.add(tf);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}