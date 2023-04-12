import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
// ---------- Global declaration of all labels --------------------
    ImageIcon i1;
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup grpOption;

    JButton next,Lifeline,submit;
    public static int timer = 20;
    public static int answer_given = 0;
    public static int count = 0;
    public static int score = 0;

    String[][] questions = new String[10][15];
    //----------------------Add questions here-------------------------

    String[][] answers = new String[10][2];
// -------------------add answers here-----------------------------

    //--------------------User Answers-------------------------
    String[][] user_answers = new String[10][1];

    String username;
    Quiz(String username){
        this.username = username;
        getContentPane().setBackground(Color.white);
        setLayout(null);



////////////////////////////////////////////////////////////
//        Please find the Qustions with Options of Quiz Application
////////////////////////////////////////////////////////////

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

////////////////////////////////////////////////////////////
//        Find below the Answers Array of the above Questions
////////////////////////////////////////////////////////////

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";






//      ------------------------Image is here--------------------------------
        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Img1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(90,10,600,300);
        add(image);
//      ---------------------------------------------------------------------




//      --------------------Question number--------------------------------
        qno = new JLabel();
        qno.setBounds(100, 350, 300, 18);
        qno.setFont(new Font("Mongolian Baiti",Font.PLAIN, 18));
        add(qno);


//      ------------------ adding Question ------------------
        question = new JLabel("This is a question");
        question.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        question.setBounds(120, 350, 1000, 18);
        add(question);
//      ---------------------------------------------------------------

        // ------------- adding radio button-----------------------------
        opt1 = new JRadioButton("option 1");
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        opt1.setBounds(120, 400, 300, 18);
        add(opt1);

        opt2 = new JRadioButton("option 2");
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        opt2.setBounds(120, 440, 300, 18);
        add(opt2);

        opt3 = new JRadioButton("option 3");
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        opt3.setBounds(120, 480, 300, 18);
        add(opt3);

        opt4 = new JRadioButton("option 4");
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        opt4.setBounds(120, 520, 300, 18);
        add(opt4);

        grpOption = new ButtonGroup();
        grpOption.add(opt1);
        grpOption.add(opt2);
        grpOption.add(opt3);
        grpOption.add(opt4);


// ------------------------ Submit Button-----------------------------

        next = new JButton("Next");
        next.setBounds(530, 440, 150, 30);
        next.setForeground(Color.white);
        next.setBackground(new Color(142, 30, 254));
        next.addActionListener(this);
        next.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        add(next);

        Lifeline = new JButton("50:50");
        Lifeline.setBounds(530, 480, 150, 30);
        Lifeline.setForeground(Color.white);
        Lifeline.setBackground(new Color(142, 30, 254));
        Lifeline.addActionListener(this);
        Lifeline.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        add(Lifeline);


        submit = new JButton("Submit");
        submit.setBounds(530, 520, 150, 30);
        submit.setForeground(Color.white);
        submit.setBackground(new Color(142, 30, 254));
        submit.addActionListener(this);
        submit.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
        submit.setEnabled(false);
        add(submit);

//--------------------------------------------------------------------------------------------------
// ------------start with 0 only--------------------
        start(count);

        setSize(800, 700);
        setLocation(200,55);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        String time = "Time left: "+timer+" sec. ";
        g.setColor(Color.red);
        if (timer>0){
            g.drawString(time, 530, 450);
        }
        else {
            g.drawString("Times UP !!!",530, 450);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            e.printStackTrace();
        }

        if(answer_given == 1){
            answer_given = 0;
            timer = 20;
        }
        else if (timer<0){

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);

            }
            if (count == 9){
                if (grpOption.getSelection() == null){
                    user_answers[count][0] = "";
                }
                else {
//////////// Important methods-------------------------------
                    user_answers[count][0] = grpOption.getSelection().getActionCommand();
                }
                for(int i = 0; i < user_answers.length; i++){
                    if(user_answers[i][0].equals(answers[i][1])){
                        score = score + 10;
                    }
                }
                setVisible(false);
                // score
                new Score(username, score);


            }else {
//            -----------------Do we really need this part????--------------------------

                if (grpOption.getSelection() == null){
                    user_answers[count][0] = "";
                }
                else {
//////////// Important methods-------------------------------
                    user_answers[count][0] = grpOption.getSelection().getActionCommand();
                }
//            ----------------------------------------------------------------------------
            }


            timer = 20;
            count++;
            start(count);
        }

    }

    public void start(int count ) {
        qno.setText(""+(count+1)+". ");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        grpOption.clearSelection();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            answer_given = 1;
            if (grpOption.getSelection() == null){
                user_answers[count][0] = "";
            }
            else {
                //////////// Important methods-------------------------------
                user_answers[count][0] = grpOption.getSelection().getActionCommand();
            }
            if (count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(e.getSource()==Lifeline){
            if (count == 2|| count == 4|| count == 6||count == 8|| count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);

            }
            Lifeline.setEnabled(false);
        }
        else if(e.getSource() == submit){
            if (grpOption.getSelection() == null){
                user_answers[count][0] = "";
            }
            else {
//////////// Important methods-------------------------------
                user_answers[count][0] = grpOption.getSelection().getActionCommand();
            }
            for(int i = 0; i < user_answers.length; i++){
                if(user_answers[i][0].equals(answers[i][1])){
                    score = score + 10;
                }
            }
            setVisible(false);
            // score
            new Score(username, score);

        }
    }
    public static void main(String[] args) {
        new Quiz("User");
    }


}
