package GUI_Test;
import javax.swing.*;
import java.awt.*;
public class calculator {
    public static void main(String []args){
        JFrame jf = new JFrame("calculator");
        Container c = jf.getContentPane();

        c.setBackground(Color.gray);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocation(600,100);
        jf.setSize(300,200);

        JPanel jp1 = new JPanel(new FlowLayout());
        JLabel jl1 = new JLabel("请输入手机号码");
        JTextField jt1 = new JTextField();
        JPanel jp2 = new JPanel(new GridLayout());
        jp1.setVisible(true);
        jf.add(jp1);
        jp1.add(jl1);
        jp1.add(jt1);
        jf.add(jp2);
    }
}
