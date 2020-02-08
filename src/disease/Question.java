package disease;


import java.util.ArrayList;
import java.awt.*;

public class Question {
    private String QuestionText;
    private int CorrectAnswerIndex;
    private ArrayList<String> Answers;
    private Graphics graph;

    // Constructors
    public Question() {}
    public Question(Graphics Graph) {graph = Graph;}
    public Question(String Question, int AnswerIndex) {}
    public Question(String Question, ArrayList<String> Answers, int AnswerIndex) {}


    public void Draw(Graphics g)
    {
    	g.drawString("BRUH", 3, 4);
    }
    public void Draw()
    {
    	graph.drawString("BRUH", 3, 4);
    }
    public String getQuestionText()
    {
        return QuestionText;
    }
    public void setQuestionText(String pQuestionText)
    {
        QuestionText = pQuestionText;
    }
    public ArrayList<String> getAnswers()
    {
        return Answers;
    }
    public void setAnswers(ArrayList<String> pAnswers){
        Answers = pAnswers;
    }
    public void setSpecificAnswer(int index, String Value) {
    	Answers.set(index, Value);
    }
    public int getCorrectAnswerIndex()
    {
        return CorrectAnswerIndex;
    }
    public void setCorrectAnswerIndex(int pAnswerIndex){
        CorrectAnswerIndex = pAnswerIndex;
    }
    public void setGraphics(Graphics i){
    	graph = i;
    }

}
