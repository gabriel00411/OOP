import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameText;
	private JTextField PasswordText;
	private JLabel StatusLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UsernameText = new JTextField();
		UsernameText.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		UsernameText.setBounds(170, 113, 230, 33);
		contentPane.add(UsernameText);
		UsernameText.setColumns(10);
		
		PasswordText = new JTextField();
		PasswordText.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		PasswordText.setColumns(10);
		PasswordText.setBounds(170, 182, 230, 33);
		contentPane.add(PasswordText);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		lblNewLabel.setBounds(45, 112, 115, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		lblPassword.setBounds(45, 182, 115, 33);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(UsernameText.getText().equals("Admin01") && PasswordText.getText().equals("AdminOne")|| 
						(UsernameText.getText().equals("Admin02") && PasswordText.getText().equals("AdminTwo") || 
								(UsernameText.getText().equals("Admin03") && PasswordText.getText().equals("AdminThree"))))
				{JOptionPane.showMessageDialog(null, "Welcome To National University!");
				}
				else{StatusLabel.setText("Username and Password does not Match!");
				
				
							
						
						
			}
		}});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(148, 278, 122, 33);
		contentPane.add(btnNewButton);
		
		StatusLabel = new JLabel("");
		StatusLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		StatusLabel.setBounds(88, 235, 247, 22);
		contentPane.add(StatusLabel);
		
		lblNewLabel_1 = new JLabel("ADMIN LOGIN");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(123, 24, 212, 33);
		contentPane.add(lblNewLabel_1);
	}
}
