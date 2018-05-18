import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class GamePlayScreen {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePlayScreen window = new GamePlayScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GamePlayScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGamePlayScreen = new JLabel("Game Play Screen");
		lblGamePlayScreen.setForeground(new Color(100, 149, 237));
		lblGamePlayScreen.setFont(new Font("Malayalam MN", Font.PLAIN, 13));
		lblGamePlayScreen.setBackground(new Color(135, 206, 250));
		lblGamePlayScreen.setBounds(158, 26, 120, 16);
		frame.getContentPane().add(lblGamePlayScreen);
		
		JLabel label = new JLabel("");
		label.setBounds(129, 69, 185, 26);
		frame.getContentPane().add(label);
		
		JLabel lblWord = new JLabel("Word");
		lblWord.setForeground(new Color(0, 0, 128));
		lblWord.setBounds(54, 79, 38, 16);
		frame.getContentPane().add(lblWord);
		
		JLabel lblAnagram = new JLabel("Anagram");
		lblAnagram.setForeground(new Color(255, 0, 0));
		lblAnagram.setBounds(43, 177, 61, 16);
		frame.getContentPane().add(lblAnagram);
		
		textField = new JTextField();
		textField.setBounds(158, 172, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
