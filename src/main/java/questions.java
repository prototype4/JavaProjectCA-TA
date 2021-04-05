import countertemp.counter;
import quiztemplate.quizoptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class questions extends JPanel {


    JLabel Question;

    JButton option1 ,
            option2,
            option3,
            option4;

    String correct_answer;

    static boolean next = false ;
    static int score = 0 ;

    static JLabel timer = new JLabel ("00 : 00 : 000") ;
    static counter count = new counter ();

    public questions (quizoptions obj , JFrame window) {

        Question = new JLabel (obj.question);
        option1 = new JButton (obj.op1) ;
        option2 = new JButton (obj.op2) ;
        option3 = new JButton (obj.op3) ;
        option4 = new JButton (obj.op4) ;
        correct_answer = obj.correct_answer ;

        JPanel pan = new JPanel () ;
        pan.setLayout(null);
        pan.setBackground(Color.DARK_GRAY);
        window.setContentPane(pan);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        setBounds(0,0,400,230);
        pan.add(this);

        add(Question); add(option1); add(option2); add(option3); add(option4);
        Question.setBounds(0,8,400,50);
        Question.setForeground(Color.WHITE);
        Question.setHorizontalAlignment(JLabel.CENTER);
        option1.setBounds(0,60,400,40);
        option2.setBounds(0,100,400,40);
        option3.setBounds(0,140,400,40);
        option4.setBounds(0,180,400,40);


        timer.setBounds(46,284,300,50);
        timer.setFont(new Font("Verdana", Font.BOLD, 40));
        timer.setBorder(BorderFactory.createLineBorder(Color.white));
        timer.setForeground(Color.white);
        pan.add(timer);


        window.setVisible(true);
    }

   public void getAnswer (int time) throws InterruptedException {
        option1.addActionListener((ActionEvent e) -> {
            if (option1.getText().equals(correct_answer)) score++;
                next = true ;
        });

        option2.addActionListener((ActionEvent e) -> {
            if (option2.getText().equals(correct_answer)) score++; 
            next = true ;
        });

        option3.addActionListener((ActionEvent e) -> {
            if (option3.getText().equals(correct_answer)) score++ ;
            next = true ;
        });

        option4.addActionListener((ActionEvent e) -> {
            if (option4.getText().equals(correct_answer)) score++ ;
            next = true ;
        });

        while (next == false ) {

            timer.setText(String.format("%02d", count.M)+" : "+String.format("%02d", count.S)+" : "+String.format("%03d", count.Ms));
            count.Ms++ ;
            Thread.sleep(1);
            if (count.Ms==999){
                count.S++ ;
                count.Ms=0 ;
            }
            if (count.S==59){
                count.M++ ;
                count.S=0;
            }

            if ((count.S + count.M*60) > time-3 ) {

                timer.setForeground(Color.red);

                if ((count.S + count.M*60)==time) {
                    return ;
                }
            }

        }

        next = false ;

    }

    public int getScore() {return score ;}

    counter getTime () {return count ;}

    void Reset () {

        count.M=0 ;
        count.Ms=0 ;
        count.S=0;
        score = 0 ;

    }

}