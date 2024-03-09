
import java.awt.*;

public class Line extends Shape {

	private Point startPoint, endPoint;

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	}

	public Line(Point start) {
		startPoint = start;
	}

	public void setEnd(Point end) {
		endPoint = end;
	}

	public Point getStart() {
		return startPoint;
	}

	public Point getEnd() {
		return endPoint;
	}

}
