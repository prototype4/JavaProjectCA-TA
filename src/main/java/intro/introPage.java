package intro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class introPage extends JPanel {

    JButton play , exit ;

    public static boolean starttimer  = false ;

    public introPage(JFrame window) {

        setSize(window.getSize().width,window.getSize().height);
        setBackground(Color.DARK_GRAY);
        setLayout(null);
        setBackground(new Color(40,40,40,30));
        window.setContentPane(this);
        JTextArea piczone = new JTextArea();
        JTextArea wannaplay = new JTextArea();


        wannaplay.setBounds(20,10,400,40);
        wannaplay.setForeground(new Color(255,255,255,255));
        wannaplay.setBackground(new Color(40,40,40));
        wannaplay.setFont(new Font("Ink Free",Font.BOLD,15));
        wannaplay.setFocusable(false);
        wannaplay.setEditable(false);
        wannaplay.setLineWrap(true);
        wannaplay.setWrapStyleWord(true);
        wannaplay.setText("You have 60sec to answer at least half of the questions or bomb explodes!!");
        wannaplay.setBorder(null);
        add(wannaplay);

        piczone.setBounds(0,58,400,250);
        piczone.setBackground(new Color(40,40,40,30));
        piczone.setBorder(null);
        piczone.setEditable(false);
        piczone.setFocusable(false);
        piczone.setForeground(new Color(255,255,255));
        piczone.setText(". ... .,-“:::::::/:::::|:::::|:::::::|:|::::::::::::::::::\\\\:::::::::::::|:|:::::\\:::\\::\\\n" +
                "... ... /::::::::::|::::::|:::::|\\::::::\\:\\::::::::::::::::::||::::::::::::|:/::::::|::::|::\\\n" +
                "... .../::::::::::::\\:::::::\\::::'\\”-,::::\\:\\,:::::::::::::::|:|::::::::::,//::::::/::::|:::'|\n" +
                "... ../::::::::::::::'\\::::::\\,:::”,”,::\\,”,,:::::::::/: |::::::,“//::::::/:::::/::,,-'\n" +
                "... ./:::::::::::::::::”,,,::\\|”~,,\\,:”~-\\”: :”,::::/: :/:::,“: :/::,“/:::,“:::/\n" +
                "... /::::::::::::::::::/,__”,\\: : ,,-~”,”',,: : :\\:/: :/:,“,-~,”,”:/:,,“:,//'\n" +
                "... |:::::::::::::::::/:o:::o: :,,“/. ,“:\\.|: : : : “: '”:/./,,”\\.'|”/::::::|“\n" +
                "...|::::::/:::::::::/::/|:::|.\\: : \\.|'|¯;|..|.|: : : : : : : :|.||;;;|././:|:::|:::|\n" +
                "...|::|:::|::::::::/::'-':::'-,': : '\\'\\'~'_/,/: : : : : : ,: :'-'-¯-'~': |:::|:::|\n" +
                "...|::|:::|::::::::/::::|:::::'|: : : “' ¯: : : : : : : : : :\\: : : : : : /::::'\\::|\n" +
                "...|::|:::|:::::::/:::::|:::::'\\: : : : : : : : : : : : : : :': : : : : :/::::::|::|\n" +
                "... \\:|:::|::::::|::::::|::::::|,: : : : : : : : : :__,: : : : : : :,-“:::::::|::|\n" +
                "... .'\\|::|::::::|::::::||::::::\\'~,: : : : : : : :'--~': : : : ,,~”\\:::::::::|:/\n" +
                "... ...'\\:|:::::|::::::/.|::::::|: : “~,: : : : : : : : ,,-~,”::::::'\\:::::::|:/\n" +
                "... ... .\\\\:::::|”~,/,|:::::::|: : : : ¯”~,,,,~”:::,,'\\::::::::\\-,,_::|/");
        add(piczone);

        play = new JButton ("Lets go...");
        play.setBackground(Color.RED);
        play.setBounds(70,310,120,50);
        play.setFont(new Font("MV Boli",Font.BOLD,15));
        play.setBorder(null);
        play.setFocusable(false);
        play.setForeground(Color.WHITE);
        add(play);

        exit = new JButton ("Leave...");
        exit.setBounds(180,310,120,50);
        exit.setFont(new Font("MV Boli",Font.BOLD,15));
        exit.setBorder(null);
        exit.setFocusable(false);
        exit.setForeground(Color.WHITE);
        add(exit);

        window.setVisible(true);

    }

    public void go (int time) {

        play.addActionListener((ActionEvent e) -> {
            starttimer = true;
            setVisible(false);
        });


        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        while (!starttimer) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }

        starttimer = false ;

    }

}