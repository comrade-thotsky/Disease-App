package disease;

import javax.swing.SwingUtilities;

public class appInitialization {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainProgram();
			}
		});
	}
}
