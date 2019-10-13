
// Demonstrate JLabel and ImageIcon.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="JLabelDemo" width=250 height=150>
</applet>
*/
public class JLabelDemo extends JApplet {

	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					 makeGUI();

				}
			});
		} catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}

	private void makeGUI() {
		// Create an icon.
		ImageIcon ii = new ImageIcon("india.gif");
		// Create a label.
		JLabel jl = new JLabel("India", ii, JLabel.CENTER);
		// Add the label to the content pane.
		add(jl);
	}


}
