import java.awt.*;
import java.awt.event.*;
class TextFiel extends Frame implements ActionListener
{
   TextFiel()
   {
    //Frame f=new Frame("Addition operation");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("+");
    Button b2=new Button("-");
    t1.setBounds(100,50,50,30);
    t2.setBounds(100,100,50,30);
    t3.setBounds(100,150,50,30);
    b1.setBounds(100,200,50,30);
    b2.setBounds(180,200,50,30);
    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);
    public void actionPerformed(ActionEvent e)
         {
                String s1=t1.getText();
                Strimg s2=t2.getText();
                int a=Integer.parseInt(s1);
                int b=Integer.perseInt(s2);
                int c=0;
                if(e.getSource()==b1)
                {
                    c=a+b;
                }
                else
                {
                    c=a-b;
                }
                String result=String.valueOf(c);
                t3.setText(result);
        }
   }
        
   
    
   
   public static void main(String args[])
   {
    new TextFiel();
   }
}