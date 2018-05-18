import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowsBuilder {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsBuilder window = new WindowsBuilder();
					window.frame.isVisible();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowsBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 102, 255));
		frame.setBounds(100, 100, 613, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(256, 304, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setBackground(Color.BLACK);
		lblWelcome.setBounds(285, 30, 61, 16);
		frame.getContentPane().add(lblWelcome);
		
		JTextArea txtrAnAnagramIs = new JTextArea();
		txtrAnAnagramIs.setBackground(new Color(0, 255, 153));
		txtrAnAnagramIs.setEditable(false);
		txtrAnAnagramIs.setText("An anagram is a word or phrase "
				+ "formed by rearranging the \nletters of a different word or phrase, "
				+ "typically using all the \noriginal letters exactly once");
		txtrAnAnagramIs.setBounds(108, 83, 420, 178);
		frame.getContentPane().add(txtrAnAnagramIs);
		// Create a parent login screen into a new window screen
	}
}
