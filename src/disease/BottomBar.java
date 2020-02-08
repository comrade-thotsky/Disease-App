package disease;

import javax.swing.*;
import java.awt.*;

public class BottomBar extends JPanel{
	private JButton butt;
	public BottomBar() {
		butt = new JButton("Pull out tray");
		// Are you insane?
		setBorder(BorderFactory.createRaisedBevelBorder());
		add(butt);
	}
}
