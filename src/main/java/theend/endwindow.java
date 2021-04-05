package theend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Date;

public class endwindow extends JPanel {

    JButton playAgain ,
            exit ;

    JLabel scoreLabel, liveordie, time ;

    static boolean again =false;

    public endwindow(JFrame window, int score, int nbrQ) {

        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);

        playAgain = new JButton ("Try Again");
        playAgain.setBackground(new Color(255,255,255)) ;
        playAgain.setBounds(100,170,200,50);
        add(playAgain);

        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,255,255)) ;
        exit.setBounds(100,240,200,50);
        add(exit);

        scoreLabel = new JLabel ("You Got : "+score+"/"+nbrQ);
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Verdana", Font.BOLD, 30));
        scoreLabel.setForeground(Color.white);
        scoreLabel.setBounds(0,20,400,100);
        add(scoreLabel);
        time = new JLabel ();
        time.setHorizontalAlignment(JLabel.CENTER);
        time.setFont(new Font("Verdana", Font.BOLD, 14));
        time.setForeground(Color.white);
        time.setBounds(0,0,400,50);
        time.setText(DateFormat.getDateTimeInstance().format(new Date()));
        add(time);

        liveordie = new JLabel ();
        liveordie.setHorizontalAlignment(JLabel.CENTER);
        liveordie.setFont(new Font("Verdana", Font.BOLD, 20));
        liveordie.setForeground(Color.white);
        liveordie.setBounds(0,60,400,100);
        add(liveordie);
        if (score>(nbrQ/2)) {
            liveordie.setForeground(Color.WHITE);
            liveordie.setText("U LIVED!!!");
        } else {
            liveordie.setForeground(Color.RED);
            liveordie.setText("U DIE.. Sadge://");
        }


        window.setVisible(true);


    }

    public void again() {

        playAgain.addActionListener((ActionEvent e) -> {
            again= true ;
        });

        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        while (!again) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }

        again = false ;

    }

}