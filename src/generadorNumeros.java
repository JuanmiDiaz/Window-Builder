import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class generadorNumeros extends JFrame {

	private JPanel contentPane;
	private final JSpinner spinner22 = new JSpinner();
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generadorNumeros frame = new generadorNumeros();
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
	public generadorNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		spinner22.setBounds(265, 139, 61, 29);
		contentPane.add(spinner22);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setBounds(265, 64, 61, 29);
		contentPane.add(spinner11);

		
		
		textField1 = new JTextField();
		textField1.setBounds(196, 191, 130, 26);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("numero 1");
		lblNewLabel.setBounds(62, 70, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("numero 2");
		lblNumero.setBounds(62, 145, 61, 16);
		contentPane.add(lblNumero);
		
		JLabel lblNumeroMayor = new JLabel("numero mayor");
		lblNumeroMayor.setBounds(62, 196, 97, 16);
		contentPane.add(lblNumeroMayor);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.setBounds(209, 232, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				int numero1=(int)spinner11.getValue();
		        int numero2=(int)spinner22.getValue();
		        
		        System.out.print(numero1);
		        System.out.print(numero2);

		        if(numero1>=numero2) {
		            
		        	String numero11 = Integer.toString(numero1);
		            textField1.setText(numero11);
		        
			
		        }else {
		        	String numero22 = Integer.toString(numero2);
		            textField1.setText(numero22);
		        	
		        	
		        }
			}
			
		});
		
		
		
	}
}
