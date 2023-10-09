import javax.swing.*;
class Checkbox
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Check Box Example");
        JCheckBox Check1=new JCheckBox("c++");
        Check1.setBounds(100,100,50,50);
        JCheckBox Check2=new JCheckBox("JAVA",true);
        Check2.setBounds(100,150,50,50);
        f.add(Check1);
        f.add(Check2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}