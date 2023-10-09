import java.awt.*;
import java.awt.event.*;
class AwtButton
{
    public static void main(String args[])
    {
        Frame f=new Frame("Awt Button");
        Button b=new Button("Click me");
        TextField t=new TextField();
        t.setBounds(100,50,70,40);
        b.setBounds(100,150,50,50);
        f.add(b);
        f.add(t);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                t.setText("Event Handling");
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}