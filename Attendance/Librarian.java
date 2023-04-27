import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Librarian extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameField;
	private JTextField PasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Librarian frame = new Librarian();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Librarian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UsernameField = new JTextField();
		UsernameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		UsernameField.setBounds(194, 119, 194, 28);
		contentPane.add(UsernameField);
		UsernameField.setColumns(10);
		
		PasswordField = new JTextField();
		PasswordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PasswordField.setColumns(10);
		PasswordField.setBounds(194, 176, 194, 28);
		contentPane.add(PasswordField);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(68, 123, 124, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(68, 180, 124, 19);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(UsernameField.getText().equals("Librarian_01") && PasswordField.getText().equals("LibOne")|| 
						(UsernameField.getText().equals("Librarian_02") && PasswordField.getText().equals("LibTwo") || 
								(UsernameField.getText().equals("Librarian_03") && PasswordField.getText().equals("LibThree"))))
				{
				Library Libra = new Library();
				Libra.LibraryFrame.setVisible(true);
				dispose();
				}
				else {JOptionPane.showMessageDialog(null, "Invalid Username and Password");
				
			}
		}});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(130, 301, 167, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("LIBRARIAN LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(109, 21, 218, 34);
		contentPane.add(lblNewLabel_1);
		
		
	}

}
