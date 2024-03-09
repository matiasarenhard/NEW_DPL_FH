
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	private static final String lineText = "    Linha    ";
	JButton lineButton;
	
	public void initAtoms() {
		original();
		lineButton = new JButton(lineText);
	}

	public void initContentPane() {
		original();
		toolPanel.add(lineButton);
	}

	public void initListeners() {
		original();
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
	}

}
