import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton rules,exit;
    JTextField Tfname;
    Login(){
        getContentPane().setBackground(Color.white);

//      ---------- for adding custom layouts-------------
        setLayout(null);
//      ------------------------------------------------

//      ---------------------------Adding Image --------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Img1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(90,10,600,300);
        add(image);
//      ------------------------------------------------------------------------------


//      ---------------------- Adding Heading ------------------------------
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(100,310, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
        heading.setForeground(new Color(142, 30, 254));
        add(heading);


//      -----------------Name Field-------------------------------
        JLabel Name = new JLabel("Enter your name ");
        Name.setForeground(new Color(142, 30, 254));
        Name.setBounds(100, 350, 300, 45);
        Name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        add(Name);

        Tfname = new JTextField();
        Tfname.setBounds(250, 365, 300, 55);
        Tfname.setSize(300,18);
        Tfname.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        add(Tfname);
//      ------------------------------------------------------------

//        ------------------- Adding Email field -----------------

        JLabel Email = new JLabel("Enter Email");
        Email.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        Email.setBounds(100, 400, 300, 45);
        Email.setForeground(new Color(142, 30, 254));
        add(Email);

        JTextField Tfemail = new JTextField();
        Tfemail.setBounds(250, 410, 300, 55);
        Tfemail.setSize(300, 18);
        Tfemail.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        add(Tfemail);

//----------------------------Adding Rules Buttons----------------
        rules = new JButton("Rules");
        rules.setBounds(300, 450, 100, 30);
        rules.setBackground(new Color(142, 30, 254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        add(rules);
//      -----------------------------------------------------------------


//      --------------------------Exit Button----------------------------
        exit  =  new JButton("Exit");
        exit.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        exit.setBackground(new Color(142,30, 254));
        exit.setBounds(100, 450, 100, 30);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        add(exit);
//        ----------------------------


        setSize(800, 700);
        setLocation(200,55);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rules) {
            setVisible(false);
            new Rules(Tfname.getText());
        }
        else if (e.getSource() == exit){
            setVisible(false);
            System.exit(0);
        }
    }



    public static void main(String[] args) {
        new Login();

    }


}
