import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Espejo extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JTextField textField;
	private JTextField textField_1;
	private JSpinner spinner;
	private JSpinner spinner_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Espejo frame = new Espejo();
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
	public Espejo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Original");
		lblNewLabel.setBounds(21, 26, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Espejo");
		lblNewLabel_1.setBounds(21, 296, 61, 16);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setEnabled(false);

		
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_1.setText(textField.getText());
				
				
				
			}
		});
		textField.setBounds(314, 63, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 339, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
					
					rdbtnNewRadioButton_3.setSelected(true);
				}
			
			
			}
		});
		rdbtnNewRadioButton.setBounds(6, 76, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					
					rdbtnNewRadioButton_4.setSelected(true);
				}				
			}
		});
		rdbtnNewRadioButton_1.setBounds(6, 129, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnNewRadioButton_2.isSelected()) {
					
					rdbtnNewRadioButton_5.setSelected(true);
				}
				
			}
		});
		rdbtnNewRadioButton_2.setBounds(6, 178, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(0, 357, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setEnabled(false);

		
		rdbtnNewRadioButton_4 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_4.setBounds(0, 403, 141, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setEnabled(false);

		
		rdbtnNewRadioButton_5 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_5.setBounds(0, 438, 141, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setEnabled(false);

		
		chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					
					chckbxNewCheckBox_3.setSelected(true);
				}
				
			}
		});
		chckbxNewCheckBox.setBounds(159, 76, 128, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1.isSelected()) {
					
					chckbxNewCheckBox_4.setSelected(true);
				}
			}
		});
		chckbxNewCheckBox_1.setBounds(159, 129, 128, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_2.isSelected()) {
					
					chckbxNewCheckBox_5.setSelected(true);
				}
			}
		});
		chckbxNewCheckBox_2.setBounds(159, 178, 128, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(159, 357, 128, 23);
		contentPane.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.setEnabled(false);
		
		chckbxNewCheckBox_4 = new JCheckBox("New check box");
		chckbxNewCheckBox_4.setBounds(159, 403, 128, 23);
		contentPane.add(chckbxNewCheckBox_4);
		chckbxNewCheckBox_4.setEnabled(false);

		
		chckbxNewCheckBox_5 = new JCheckBox("New check box");
		chckbxNewCheckBox_5.setBounds(159, 438, 128, 23);
		contentPane.add(chckbxNewCheckBox_5);
		chckbxNewCheckBox_5.setEnabled(false);

		
		spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				spinner_1.setValue((Integer)spinner.getValue());

			}
		});
		spinner.setBounds(314, 177, 115, 26);
		contentPane.add(spinner);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 257, 413, 12);
		contentPane.add(separator);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(314, 435, 115, 26);
		contentPane.add(spinner_1);
		spinner_1.setEnabled(false);

		
		
		
			

			
			
		
			
			

	         
			
			

			

		
		
		
	}
}
