import java.awt.*;
import java.awt.event.*;
class Action extends Frame
{
    //TextField tf;
    Action()
    {
       TextField tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Click me");
        b.setBounds(50,120,80,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Hello");
            }
        });
        add(b);add(tf);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        Action a=new Action();
    }
}