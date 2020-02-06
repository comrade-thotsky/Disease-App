package disease;

import javax.swing.*;
import java.awt.*;

public class MainProgram extends JFrame{
	private ToolbarThing lol;
	private JLabel lab;
	private SideBar side;
	private BottomBar bot;
	private ImageIcon img;
	private JLabel lab2;
	public MainProgram() {
		super("Disease Prevention");

		// The below line was causing errors : /
		// the reason was because there was no "betterogre.jpg". I think I accidentally deleted it when deleting the extra files. I'm re-adding it so this will work again.
		img = new ImageIcon(getClass().getResource("betterogre.jpg"));
		lab2 = new JLabel(img);
		bot = new BottomBar();
		side = new SideBar();
		lol = new ToolbarThing();
		// Tyler What are you on?
		lab = new JLabel("blaosdkqowdkqwodkow dwqodkowq dwodkowix qoxkow ndwwoq wjkkdoqwkdwq odnjdkowqkd");
		setLayout(new BorderLayout());
		
		add(lab2, BorderLayout.EAST);
		add(lol, BorderLayout.NORTH);
		add(new JScrollPane(lab), BorderLayout.CENTER);
		add(side, BorderLayout.WEST);
		add(bot, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
}
