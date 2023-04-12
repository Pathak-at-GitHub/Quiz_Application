import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    Rules(String Tfname){
        this.name = Tfname;
        getContentPane().setBackground(Color.white);
        setLayout(null);
//----------------Heading for rules--------------------------
        JLabel Heading_rules = new JLabel("Rules for you, "+name);
        Heading_rules.setBounds(100,30, 300, 45);
        Heading_rules.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
        Heading_rules.setForeground(new Color(142, 30, 254));
        add(Heading_rules);
//        --------------------------------------------------------

//        ------------------------ writing rules dynamically-----------------

        JLabel rules = new JLabel();
        rules.setForeground(new Color( 142, 30, 254));
        rules.setFont(new Font("Mongolian Baiti", Font.PLAIN ,18));
        rules.setBounds(110, -200 , 600, 1000);
        ///////////////////////////////////////////////////////////
        //        Find below the Rules
        //////////////////////////////////////////////////////////
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );

        add(rules);
//      ----------------------------------------------------
//      ------------------ Adding start button --------------
        start = new JButton("Start");
        start.setBounds(300, 550, 100, 30);
        start.setBackground(new Color(142, 30, 254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        add(start);

//      ------------- Adding back buttons-------------

        back = new JButton("Back");
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        back.setBackground(new Color(142,30, 254));
        back.setBounds(100, 550, 100, 30);
        back.addActionListener(this);
        back.setForeground(Color.white);
        add(back);
//      ---------------------------------------------------


        setSize(800, 700);
        setLocation(200,55);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start){
            setVisible(false);
            new Quiz(name);

        }
        else if (e.getSource()== back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }


}
