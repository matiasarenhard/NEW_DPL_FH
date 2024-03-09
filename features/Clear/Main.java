
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	private static final String wipeText = "   Limpar   ";
	JButton wipeButton;

	public void initAtoms() {
		original();
		wipeButton = new JButton(wipeText);
	}

	public void initContentPane() {
		original();
		toolPanel.add(wipeButton);
	}

	public void initListeners() {
		original();
		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
	}

}
