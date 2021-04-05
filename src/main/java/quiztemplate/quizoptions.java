package quiztemplate;

public class quizoptions {

    public String question;
    public String op1;
    public String op2;
    public String op3;
    public String op4;
    public String correct_answer;


    public quizoptions(String question, String op1, String op2, String op3, String op4, String corrAns) {
        this.question = question ;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3 ;
        this.op4 = op4 ;
        this.correct_answer = corrAns ;
    }
}
