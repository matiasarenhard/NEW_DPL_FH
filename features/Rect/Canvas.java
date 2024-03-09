
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.event.*;
import javax.swing.JComponent;

import java.awt.Point;

@SuppressWarnings("serial")
public class Canvas extends JComponent implements MouseListener, MouseMotionListener {
	public enum FigureTypes {RECT};

	protected BasicRectangle newRect = null;

	public void mousePressed(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.RECT) {
			// If there is no line being created
			if (newRect == null) {
				newRect = new BasicRectangle(e.getX(), e.getY());
				shapes.add(newRect);
			}
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.RECT) {
			newRect = null;
		}
	}

	public void mouseDragged(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.RECT) {
			newRect.setEnd(e.getX(), e.getY());
			repaint();
		}
	}

}
