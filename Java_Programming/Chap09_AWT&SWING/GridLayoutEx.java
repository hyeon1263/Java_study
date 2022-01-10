import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("이름", SwingConstants.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("학번", SwingConstants.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("학과", SwingConstants.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("과목", SwingConstants.CENTER));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}