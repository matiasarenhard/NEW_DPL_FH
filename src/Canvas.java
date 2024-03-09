
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.event.MouseEvent; 
import java.util.*; 
import java.awt.event.*; 
import javax.swing.JComponent; 

import java.awt.Point; 

@SuppressWarnings("serial")
public  class  Canvas  extends JComponent  implements MouseListener, MouseMotionListener {
	

	Point start, end;

	
	protected List<Shape> shapes = new LinkedList<Shape>();

	
	public  enum  FigureTypes {NONE , LINE , RECT}

	;

	
	public FigureTypes figureSelected = FigureTypes.NONE;

	

	/** Sets up the canvas. Do not change */
	public Canvas() {
		this.setDoubleBuffered(true); // for display efficiency
		this.addMouseListener(this); // registers the mouse listener
		this.addMouseMotionListener(this); // registers the mouse motion
											// listener
	}

	

	/** Sets the selected figure. Do not change. */
	public void selectedFigure(FigureTypes fig) {
		figureSelected = fig;
	}

	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// refreshes the canvas
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for (Shape s : shapes) {
			s.paint(g);
		}
	}

	

	// **************** Mouse Handling
	public void mouseClicked(MouseEvent e) {
	}

	

	// mouseClicked
	public void mouseEntered(MouseEvent e) {
	}

	

	/**
	 * Invoked when the mouse exits a component. Empty implementation. Do not
	 * change.
	 */
	public void mouseExited(MouseEvent e) {
	}

	

	
	/** Invoked when a mouse button has been pressed on a component. */
	 private void  mousePressed__wrappee__Base  (MouseEvent e) {
	}

	

	 private void  mousePressed__wrappee__Line  (MouseEvent e) {
		mousePressed__wrappee__Base(e);
		if (figureSelected == FigureTypes.LINE) {
			if (newLine == null) {				
				start = new Point(e.getX(), e.getY());
				newLine = new Line(start);
				shapes.add(newLine);
			}
		}
	}

	

	public void mousePressed(MouseEvent e) {
		mousePressed__wrappee__Line(e);
		if (figureSelected == FigureTypes.RECT) {
			// If there is no line being created
			if (newRect == null) {
				newRect = new BasicRectangle(e.getX(), e.getY());
				shapes.add(newRect);
			}
		}
	}

	
	

	/** Invoked when a mouse button has been released on a component. */
	 private void  mouseReleased__wrappee__Base  (MouseEvent e) {
	}

	

	 private void  mouseReleased__wrappee__Line  (MouseEvent e) {
		mouseReleased__wrappee__Base(e);
		if (figureSelected == FigureTypes.LINE) {
			newLine = null;
		}
	}

	
	
	public void mouseReleased(MouseEvent e) {
		mouseReleased__wrappee__Line(e);
		if (figureSelected == FigureTypes.RECT) {
			newRect = null;
		}
	}

	

	/** Invoked when the mouse is dragged over a component */
	 private void  mouseDragged__wrappee__Base  (MouseEvent e) {
	}

	

	 private void  mouseDragged__wrappee__Line  (MouseEvent e) {
		mouseDragged__wrappee__Base(e);
		if (figureSelected == FigureTypes.LINE) {
			newLine.setEnd(new Point(e.getX(), e.getY()));
			repaint();
		}
	}

	

	public void mouseDragged(MouseEvent e) {
		mouseDragged__wrappee__Line(e);
		if (figureSelected == FigureTypes.RECT) {
			newRect.setEnd(e.getX(), e.getY());
			repaint();
		}
	}

	

	/* Empty implementation. Do not change. */
	public void mouseMoved(MouseEvent e) {
	}

	

	public void wipe() {
		this.shapes.clear();
		this.repaint();
	}

	;

	

	protected Line newLine = null;

	;

	

	protected BasicRectangle newRect = null;


}
