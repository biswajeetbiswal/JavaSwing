import javax.swing.*;
class JframeByInheritance extends JFrame
{
    JFrame f;
  JframeByInheritance()
  {
    JButton b=new JButton("Click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,400);
        setTitle("Jframe Window");
        setLayout(null);
        setVisible(true);
  }
  public static void main(String args[])
  {
    new JframeByInheritance();
  }
}