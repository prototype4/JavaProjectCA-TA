import intro.introPage;
import quiztemplate.quizoptions;
import theend.endwindow;

import javax.swing.*;
import java.awt.*;


public class appLauncher {
    public static void main(String[] args) throws InterruptedException {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame window = new JFrame ("quiz game");
        window.setBackground(new Color(40,40,40));
        window.setSize(400,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        while (true) {

            int ete =0 , score=0 , m=0 , s=0 ;
            int time = 60 ;

            introPage welcome = new introPage(window);
            welcome.go(time);

            quizoptions[] quet = {
                    new quizoptions("Suicide Squad is based on which comics?","Marvel","DC Comics","Manga","Keituki","DC Comics"),
                    new quizoptions("How many bones are there in the human body?","325","196","155","206","206"),
                    new quizoptions("Which vitamin is present in citrus fruits?","B","E","C","B4","C"),
                    new quizoptions("Which planet is closest to Sun?","Mars","Jupiter","Saturn","Mercury","Mercury"),
                    new quizoptions("Mc Donald’s is the fast-food company founded in?","2002","1988","1844","1940","1940"),
                    new quizoptions("Best place to learn code in LT","VGTU","KTU","CodeAcademy","MRU","CodeAcademy"),
                    new quizoptions("Acrophobia is the phobia of?","Spiders","Women","Heights","Love","Heights"),
                    new quizoptions("Jerusalem is the capital of which country?","Austria","Estonia","Greece","Israel","Israel"),
                    new quizoptions("DNA stands for?","Dont NEGOTIATE Aids","Deoxyribonucleic Acid","Dunno Not Acceptable","Do not ask","Deoxyribonucleic Acid"),
                    new quizoptions("How many parts does a brain has?","7","3","1","5","3"),
                    new quizoptions("RAM stands for?","Random Access Memory","Roam and mess","Random Access mind","Rake and mind","Random Access Memory"),
                    new quizoptions("This is...","Bomb","Sparta!!","Love","QuizApp","QuizApp"),
                    new quizoptions("Nutella was invented in?","WWI"," WWII"," WWIII","Dunno","WWI"),
                    new quizoptions("USB stands for?","Universal Serial Bus","Unified Serial Bus","Universal Serial Bus","Universal Service Bus","Universal Serial Bus"),
                    new quizoptions("What planet is closest in size to our moon?","Mercury","Jupiter","Mars","Platon","Mercury"),
                    new quizoptions("What is the name of Hitler’s Party?","UN Party","Nazi Party","Smith Party","SS Party","Nazi Party"),
                    new quizoptions("Statue of Liberty is situated in?","France","Germany","Sweden","Lithuania","France"),
                    new quizoptions("WWII was fought in?","1909-1925","1930-1945","1939-1945","1962-1974","1939-1945"),
                    new quizoptions("who is the father of Psychology?","Wilhelm Wundt","Sigmund Freud","Mark Wiliams","Tom Aufelius","Wilhelm Wundt"),
                    new quizoptions("which country is the owner of SAMSUNG?","United States","South Korea","Germany","France","South Korea"),
                    new quizoptions("what is the highest world currency?","USD","Eur","Kuwait Dinar","Dhr","Kuwait Dinar"),
            };

            while (ete != quet.length && s<time ) {
                questions quiz = new questions(quet[ete], window);
                quiz.getAnswer(time);
                m = quiz.getTime().M ;
                s = quiz.getTime().S ;
                score = quiz.getScore();
                if (ete == quet.length-1 || (s==time)) quiz.Reset();
                ete++ ;
            }

            int eteQ = quet.length ;
            endwindow endwindow = new endwindow(window,score,eteQ) ;
            endwindow.again();

        }

    }

}