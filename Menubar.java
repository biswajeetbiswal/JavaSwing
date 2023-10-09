import javax.swing.*;
class Menubar
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Frame bar");
        JMenuBar mb=new JMenuBar();
        JMenu m=new JMenu("menu");
        JMenu sub =new JMenu("submenu");
        JMenuItem i1=new JMenuItem("item1");
        JMenuItem i2=new JMenuItem("item2");
        JMenuItem i3=new JMenuItem("item3");
        JMenuItem i4=new JMenuItem("item4");
        JMenuItem i5=new JMenuItem("item5");
        m.add(i1);m.add(i2);m.add(i3);
        sub.add(i4);sub.add(i5);
        m.add(sub);
        mb.add(m);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}