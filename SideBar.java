package disease;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SideBar extends JPanel{
	
	public SideBar() {
		setBorder(BorderFactory.createRaisedBevelBorder());
		Dimension dim = getPreferredSize();
		dim.width = 50;
		setPreferredSize(dim);
	}
}
