import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame {
    private JPanel contentPane;
    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Picture");
        setBounds(100,100,300,500);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());

        JLabel lab1 = new JLabel("Picture 0", JLabel.CENTER);
        contentPane.add(lab1);

        JLabel lab2 = new JLabel(new ImageIcon("c:\\Users\\林芊妤\\Desktop\\VS code\\oop2_6\\4.png"));
        contentPane.add(lab2);                         

        JButton btn1 = new JButton("Previous");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (lab1.getText().equals("Picture 0")) {
                    JOptionPane.showMessageDialog(null, "沒有圖了");
                }else if (lab1.getText().equals("Picture 1")) {
                    lab1.setText("Picture 0");
                    lab2.setIcon(new ImageIcon("c:\\Users\\林芊妤\\Desktop\\VS code\\oop2_6\\4.png"));
                }else if (lab1.getText().equals("Picture 2")) {
                    lab1.setText("Picture 1");
                    lab2.setIcon(new ImageIcon("c:\\Users\\林芊妤\\Desktop\\VS code\\oop2_6\\5.png"));
                }
            }
        });
        contentPane.add(btn1);

        JButton btn2 = new JButton("Next");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (lab1.getText().equals("Picture 0")) {
                    lab1.setText("Picture 1");
                    lab2.setIcon(new ImageIcon("c:\\Users\\林芊妤\\Desktop\\VS code\\oop2_6\\5.png"));
                }else if(lab1.getText().equals("Picture 1")) {
                    lab1.setText("Picture 2");
                    lab2.setIcon(new ImageIcon("c:\\Users\\林芊妤\\Desktop\\VS code\\oop2_6\\12.png"));
                }else if(lab1.getText().equals("Picture 2")) {
                    JOptionPane.showMessageDialog(null, "沒有圖了");
                } 
            }
        });
        contentPane.add(btn2);

        setVisible(true);
    } 
}

public class homework {
    public static void main(String[] args) throws Exception{
        MyJFrame f1 = new MyJFrame();
    }
}
