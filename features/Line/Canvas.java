
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.event.*;
import javax.swing.JComponent;

import java.awt.Point;

@SuppressWarnings("serial")
public class Canvas extends JComponent implements MouseListener, MouseMotionListener {
	public enum FigureTypes {LINE};

	protected Line newLine = null;

	public void mousePressed(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.LINE) {
			if (newLine == null) {				
				start = new Point(e.getX(), e.getY());
				newLine = new Line(start);
				shapes.add(newLine);
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.LINE) {
			newLine = null;
		}
	}

	public void mouseDragged(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.LINE) {
			newLine.setEnd(new Point(e.getX(), e.getY()));
			repaint();
		}
	}

}
