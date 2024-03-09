
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	protected JPanel toolPanel = new JPanel();
	protected Canvas canvas = new Canvas();
	protected Container contentPane;

	// Layout components declaration

	/** Initializes layout . No need to change */
	public void initLayout() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.Y_AXIS));
	}

	// *** Initialization of atomic elements
	public void initAtoms() {
	}

	/** Initializes the content pane */
	public void initContentPane() {
		contentPane.add(toolPanel, BorderLayout.WEST);
		contentPane.add(canvas, BorderLayout.CENTER);
	}

	public void initListeners() {
	}

	// Initializes entire containment hierarchy
	public void init() {
		initAtoms();
		initLayout();
		initContentPane();
		initListeners();
	}

	/* Constructor. No need to modify */
	public Main(String appTitle) {
		super(appTitle);
		init();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		setResizable(true);
		validate();
	}

	/** main method */
	public static void main(String[] args) {
		new Main("Draw DPL FH");
	}

}
