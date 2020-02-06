package disease;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Question {
    private String QuestionText;
    private int CorrectAnswerIndex;
    private ArrayList<String> Answers;

    public Question() {}
    public Question(String Question, int AnswerIndex) {}
    public Question(String Question, ArrayList<String> Answers, int AnswerIndex) {}


    public void Draw(JFrame screen)
    {
        // Question Title
        JLabel QuestionLabel = new JLabel();
        QuestionLabel.setText("Question " + QuestionText);
        // Sets Position of the label.
        //QuestionLabel.setBounds();
        screen.add(QuestionLabel);
    }

}
