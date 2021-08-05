import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class clicksGUI implements ActionListioner {

	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		 frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		 label = new JLabel("Number of clicks: 0")
		
		 panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Click away")
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new clicksGUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
		
	}
}
