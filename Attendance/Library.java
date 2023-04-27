import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library {

	JFrame LibraryFrame;
	private JTextField txtBookNum;
	private int[] bookList = {1, 2, 3};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library window = new Library();
					window.LibraryFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Library() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LibraryFrame = new JFrame();
		LibraryFrame.setTitle("BORROW BOOKS");
		LibraryFrame.setBounds(100, 100, 815, 505);
		LibraryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibraryFrame.getContentPane().setLayout(null);
		
		JLabel AvailBooks = new JLabel("NU LIBRARY SYSTEM");
		AvailBooks.setFont(new Font("Tahoma", Font.BOLD, 30));
		AvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
		AvailBooks.setBounds(211, 15, 369, 76);
		LibraryFrame.getContentPane().add(AvailBooks);
		
		JLabel Book1 = new JLabel("Harry Potter and the Prizoner of Azkaban");
		Book1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		Book1.setHorizontalAlignment(SwingConstants.CENTER);
		Book1.setBounds(252, 167, 314, 56);
		LibraryFrame.getContentPane().add(Book1);
		
		JLabel Book2 = new JLabel("Divergent");
		Book2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Book2.setHorizontalAlignment(SwingConstants.CENTER);
		Book2.setBounds(281, 228, 232, 56);
		LibraryFrame.getContentPane().add(Book2);
		
		JLabel Book3 = new JLabel("The Little Prince");
		Book3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Book3.setHorizontalAlignment(SwingConstants.CENTER);
		Book3.setBounds(291, 289, 232, 56);
		LibraryFrame.getContentPane().add(Book3);
		
		JLabel Author1 = new JLabel("J.K. ROWLING");
		Author1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1.setBounds(82, 174, 130, 44);
		LibraryFrame.getContentPane().add(Author1);
		
		JLabel Author2 = new JLabel("Veronica Roth");
		Author2.setHorizontalAlignment(SwingConstants.CENTER);
		Author2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author2.setBounds(25, 228, 232, 56);
		LibraryFrame.getContentPane().add(Author2);
		
		JLabel Author3 = new JLabel("Antoine de Saint-Exupéry");
		Author3.setHorizontalAlignment(SwingConstants.CENTER);
		Author3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author3.setBounds(35, 289, 232, 56);
		LibraryFrame.getContentPane().add(Author3);
		
		JLabel Author1_1 = new JLabel("1");
		Author1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1_1.setBounds(558, 168, 232, 56);
		LibraryFrame.getContentPane().add(Author1_1);
		
		JLabel Author1_2 = new JLabel("2");
		Author1_2.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1_2.setBounds(558, 223, 232, 56);
		LibraryFrame.getContentPane().add(Author1_2);
		
		JLabel Author1_3 = new JLabel("3");
		Author1_3.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Author1_3.setBounds(558, 289, 232, 56);
		LibraryFrame.getContentPane().add(Author1_3);
		
		JLabel lblBookTitles = new JLabel("BOOK TITLES :");
		lblBookTitles.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookTitles.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBookTitles.setBounds(281, 101, 232, 56);
		LibraryFrame.getContentPane().add(lblBookTitles);
		
		JLabel lblAuthors = new JLabel("AUTHORS :");
		lblAuthors.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthors.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAuthors.setBounds(25, 101, 232, 56);
		LibraryFrame.getContentPane().add(lblAuthors);
		
		JLabel lblNumOfCopies = new JLabel("# of Available Copies:");
		lblNumOfCopies.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumOfCopies.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNumOfCopies.setBounds(539, 102, 232, 56);
		LibraryFrame.getContentPane().add(lblNumOfCopies);
		
		JLabel lblNewLabel = new JLabel("ENTER BOOK NUMBER:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 387, 189, 56);
		LibraryFrame.getContentPane().add(lblNewLabel);
		
		txtBookNum = new JTextField();
		txtBookNum.setBounds(258, 399, 118, 36);
		LibraryFrame.getContentPane().add(txtBookNum);
		txtBookNum.setColumns(10);
		
		final JButton btnBorrow = new JButton("Enter");
		btnBorrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnBorrow) {
		            int bookNum = Integer.parseInt(txtBookNum.getText());
		            if (bookNum >= 0 && bookNum < bookList.length && bookList[bookNum] > 0) {
		                bookList[bookNum]--;
		                
		                JOptionPane.showMessageDialog(LibraryFrame, "You have borrowed a book!");
		            } 
		            else if
		            
		            	(bookNum >= 3) {
			             
			             JOptionPane.showMessageDialog(LibraryFrame, "Book does not Exist");
		            	
		            }
		      
		            else {
		                JOptionPane.showMessageDialog(LibraryFrame, "No Copies Available");
		            }
		        }
			}
		});
		btnBorrow.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBorrow.setBounds(505, 393, 130, 44);
		LibraryFrame.getContentPane().add(btnBorrow);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(25, 176, 45, 32);
		LibraryFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(25, 246, 45, 32);
		LibraryFrame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("2");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(25, 307, 25, 32);
		LibraryFrame.getContentPane().add(lblNewLabel_1_2);
	}

}
