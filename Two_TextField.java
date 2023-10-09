import java.awt.event.*;
import javax.swing.*;
class Two_TextField
{
    public static void main(String args[])
    {
       JFrame f=new JFrame("textfield example");
       JTextField tf1,tf2;
       tf1=new JTextField();
       tf1.setBounds(100,100,150,30);
       tf2=new JTextField();
       tf2.setBounds(20,20,150,30);
       JButton b1=new JButton("click me");
       b1.setBounds(180,180,100,20);
       JButton b2=new JButton("check me");
       b2.setBounds(200,200,100,20);
       b1.addActionListener( new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tf1.setText("From button1");
        }
       });
       b2.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e){
            tf2.setText("From button2");
        }
       });
       f.add(b1);f.add(b2);f.add(tf1);f.add(tf2);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
    }
}