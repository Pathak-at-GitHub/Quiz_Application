import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    ImageIcon i1;
    String username;
    JButton submit,exit;
    Score(String username, int score) {
        this.username = username;
        getContentPane().setBackground(Color.white);
        setLayout(null);



        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Img1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(90,10,600,300);
        add(image);

        JLabel heading = new JLabel("Thank you "+username+", for playing the quiz..");
        heading.setBounds(100,330, 1000, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
        heading.setForeground(new Color(142, 30, 254));
        add(heading);

        JLabel marks = new JLabel("Here is your score : "+score+" /100");
        marks.setBounds(100,370, 1000, 45);
        marks.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        marks.setForeground(new Color(142, 30, 254));
        add(marks);

        submit = new JButton("Play again");
        submit.setBounds(530, 520, 150, 30);
        submit.setForeground(Color.white);
        submit.setBackground(new Color(142, 30, 254));
        submit.addActionListener(this);
        submit.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        add(submit);

        exit = new JButton("Exit");
        exit.setBounds(130, 520, 150, 30);
        exit.setForeground(Color.white);
        exit.setBackground(new Color(142, 30, 254));
        exit.addActionListener(this);
        exit.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        add(exit);


        setSize(800, 700);
        setLocation(200,55);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit){
            setVisible(false);
            new Quiz(username);
        }
        else if(e.getSource()==exit){
            setVisible(false);
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Score("User", 0);
    }


}
