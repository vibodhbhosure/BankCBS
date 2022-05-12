package com.mycompany.bank_cbs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.email.durgesh.Email;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Profile - FinVerse PSB");
		setType(Type.POPUP);
		
		setBounds(165, 30, 1368, 796);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(560, 146, 666, 529);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Account Number");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(130, 94, 180, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Aadhar Number");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(130, 149, 180, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Account Type");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(130, 203, 180, 32);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(130, 257, 180, 32);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Phone Number");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(130, 306, 180, 32);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(130, 365, 180, 32);
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(358, 102, 200, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(358, 156, 200, 25);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(358, 210, 200, 25);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBounds(358, 264, 200, 25);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(358, 314, 200, 25);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setBounds(358, 372, 200, 25);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Balance");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(130, 422, 180, 32);
		panel.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(358, 427, 200, 25);
		panel.add(textField_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vibod\\OneDrive\\Desktop\\logo_small.png"));
		lblNewLabel.setBounds(10, 10, 126, 76);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(183, 522, 113, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\vibod\\OneDrive\\Desktop\\Avatar-Face-Transparent (1).png"));
		lblNewLabel_1.setBounds(133, 213, 208, 234);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root123");
					Statement stmt=con.createStatement();
					String sql="Select * from acc_details where acc_no='"+textField_6.getText()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
						{
						Statement stmt1=con.createStatement();
						String sql1="Select aadhar_number FROM acc_details where acc_no='"+textField_6.getText()+"'";
						ResultSet sql1_result=stmt1.executeQuery(sql1);
						while(sql1_result.next()) {
							String aadhar_number = rs.getString("aadhar_number");
							String acc_no = rs.getString("acc_no");
							String account_type = rs.getString("account_type");
							String email = rs.getString("email");
							String phone_number = rs.getString("phone_number");
							String address = rs.getString("address");
							String balance = rs.getString("balance");
							String name = rs.getString("name");
							textField_1.setText(aadhar_number);
							textField.setText(acc_no);
							textField_2.setText(account_type);
							textField_3.setText(email);
							textField_4.setText(phone_number);
							textField_5.setText(address);
							textField_7.setText(balance);
							textField_8.setText(name);
						} 
					}
					else {
						JOptionPane.showMessageDialog(null, "     !!!No User Found!!!\n  For the Entered Details");
						
						}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Database Connectivity Failed\nContact System Admin");
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\vibod\\OneDrive\\Desktop\\475625.png"));
		btnNewButton_1.setBounds(583, 29, 63, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Account Number");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(203, 29, 176, 25);
		contentPane.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBounds(389, 29, 176, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.BLUE);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setBounds(133, 465, 200, 25);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
	}
}
