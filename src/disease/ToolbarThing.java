package disease;

import java.awt.*;
import javax.swing.*;

public class ToolbarThing extends JPanel{
	private JButton first;
	private JButton second;
	public ToolbarThing() {
		first = new JButton("Topic 1");
		second = new JButton("Topic 2");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBorder(BorderFactory.createRaisedBevelBorder());
		add(first);
		add(second);
	}
}
