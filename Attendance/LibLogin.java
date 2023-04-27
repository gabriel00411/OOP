import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibLogin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibLogin window = new LibLogin();
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
	public LibLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lovely\\Documents\\DEREK\\National_University_seal.png"));
		frame.setBounds(100, 100, 493, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADMIN LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin admin = new AdminLogin();
				admin.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(100, 171, 252, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLibrarianLogin = new JButton("LIBRARIAN LOGIN");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LibrarianLogin libr = new LibrarianLogin();
				libr.setVisible(true);
			}
		});
		btnLibrarianLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLibrarianLogin.setBounds(100, 242, 252, 55);
		frame.getContentPane().add(btnLibrarianLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lovely\\Documents\\DEREK\\natlogo.png"));
		lblNewLabel.setBounds(47, 10, 356, 97);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LIBRARY MANAGEMENT");
		lblNewLabel_1.setForeground(new Color(0, 0, 160));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(130, 117, 222, 19);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
