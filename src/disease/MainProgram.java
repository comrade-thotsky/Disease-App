package disease;

import java.awt.*;
import javax.swing.*;
import java.util.*;
public class MainProgram extends JFrame{
	public Thread t;
	// Test Button
	private JButton ChoiceOne = new JButton();
	// Test Question
	private Question QuestOne = new Question();
	// Made to copy the graphics onto another object
	private Graphics graphicsCopy;
	// String State of the Main Program
	private String Page = "Main Menu";
	public MainProgram() {
		// Title of the Window
		super("Disease Prevention Project");
		// Setting a null layout so that I can position things correctly
		setLayout(null);
		// Setting the Size of the window
		setSize(800,600);
		// Making it able to be seen.
		setVisible(true);
		// Changing the dimensions of the JButton
		ChoiceOne.setBounds(getWidth()/9, 0, getWidth()/6, getHeight()/4);
		// Setting the Button Text to "Test"
		ChoiceOne.setText("Test");
		
	}
	public void paint(Graphics g) {
		// Fills the screen black
		g.fillRect(0, 0, getWidth(), getHeight());
		// Changing the position of the test button to be relative to the size of the window.
		ChoiceOne.setBounds(0, 0, getWidth()/6, getHeight()/6);	
		// Copies the graphics object into the graphics variable
		graphicsCopy = g;
		// Function that replaces the button text and correct answer such that the person will be able to answer the question
		loadQuestion(QuestOne);
    	}
	public void loadQuestion(Question q) {
		
	}
	
	
}
