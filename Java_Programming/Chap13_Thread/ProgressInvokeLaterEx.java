import javax.swing.*;

public class ProgressInvokeLaterEx extends JPanel {

	JProgressBar progress;
	static int min = 0;
	static int max = 100;
	int value;
	public ProgressInvokeLaterEx() {
		progress = new JProgressBar();
		progress.setMinimum(min);
		progress.setMaximum(max);
		add(progress);
    
		JFrame frame = new JFrame("Progress Bar Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		frame.setSize(300, 200);
		frame.setVisible(true);

		for (int i = min; i <= max; i++) {
			value = i;
			try {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {	
						//progress.setValue(value);
						updateBar(value);
					}
				});
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	public void updateBar(int newValue) {
		progress.setValue(newValue);
	}

	public static void main(String args[]) {
		new ProgressInvokeLaterEx();
	}
}