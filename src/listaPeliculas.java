import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listaPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textPelicula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaPeliculas frame = new listaPeliculas();
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
	public listaPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce una nueva pelicula");
		lblNewLabel.setBounds(61, 71, 196, 16);
		contentPane.add(lblNewLabel);
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(406, 101, 169, 27);
		contentPane.add(comboBox);
		
		textPelicula = new JTextField();
		textPelicula.setBounds(47, 99, 216, 29);
		contentPane.add(textPelicula);
		textPelicula.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir película");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
		        
				comboBox.addItem(textPelicula.getText());
		        textPelicula.setText("");
		         
				
			}
			
			
		});
		btnNewButton.setBounds(97, 175, 130, 29);
		contentPane.add(btnNewButton);
		
		
		
		
		
	}
}
