import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class miniEncuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miniEncuesta frame = new miniEncuesta();
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
	public miniEncuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		lblNewLabel.setBounds(23, 46, 205, 22);
		contentPane.add(lblNewLabel);
		
		JRadioButton opcionW = new JRadioButton("Windus");
		opcionW.setBounds(23, 80, 141, 23);
		contentPane.add(opcionW);
		
		JRadioButton opcionM = new JRadioButton("Mac Todopoderoso");
		opcionM.setBounds(22, 126, 155, 23);
		contentPane.add(opcionM);
		
		JRadioButton opcionL = new JRadioButton("Linus");
		opcionL.setBounds(22, 101, 141, 23);
		contentPane.add(opcionL);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 164, 172, 12);
		contentPane.add(separator);
		
		JLabel lblEligeTuEspecialidad = new JLabel("Elige tu especialidad");
		lblEligeTuEspecialidad.setBounds(23, 187, 205, 22);
		contentPane.add(lblEligeTuEspecialidad);
		
		JCheckBox checkP = new JCheckBox("Programación");
		checkP.setBounds(23, 221, 128, 23);
		contentPane.add(checkP);
		
		JCheckBox checkD = new JCheckBox("Diseño Gráfico");
		checkD.setBounds(23, 245, 128, 23);
		contentPane.add(checkD);
		
		JCheckBox checkA = new JCheckBox("Administración");
		checkA.setBounds(23, 269, 128, 23);
		contentPane.add(checkA);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 304, 172, 12);
		contentPane.add(separator_1);
		
		JLabel lblEligeTuEspecialidad_1 = new JLabel("Número de horas que dedicas");
		lblEligeTuEspecialidad_1.setBounds(23, 331, 205, 22);
		contentPane.add(lblEligeTuEspecialidad_1);
		
		JSlider slider1 = new JSlider();
		slider1.setMaximum(10);
		slider1.setBounds(23, 356, 190, 29);
		contentPane.add(slider1);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				String so ="";
				String esp="";
				if(opcionW.isSelected() && opcionL.isSelected()) {
					JOptionPane.showMessageDialog(null, "Sólo puedes elegir una opción ");	
				}else if (opcionW.isSelected()&& opcionM.isSelected()) {
					JOptionPane.showMessageDialog(null, "Sólo puedes elegir una opción ");	
				}else if (opcionL.isSelected()&& opcionM.isSelected()){
					JOptionPane.showMessageDialog(null, "Sólo puedes elegir una opción ");	
				}else if(opcionW.isSelected() && opcionL.isSelected() && opcionM.isSelected()) {
					JOptionPane.showMessageDialog(null, "Sólo puedes elegir una opción ");	
				}else if(opcionW.isSelected()) {
					 so =opcionW.getText();
				}else if(opcionL.isSelected()) {
					 so =opcionL.getText();
				}else if(opcionM.isSelected()) {
					 so =opcionM.getText();
				}
				
				
				if(checkP.isSelected()) {
					esp += checkP.getText() + " ";
				}
				if(checkD.isSelected()) {
					esp += checkD.getText() + " ";
				}
				if(checkA.isSelected()) {
					esp += checkA.getText() + " ";
				}
				
				

		         
				
				
				JOptionPane.showMessageDialog(null, "Tu sistema operativo es " + so + " y tus especialidades son " + esp +" y el número de horas que dedicas es " +slider1.getValue());	

				
	
			}
			
			
			
			
			
		});
		btnNewButton.setBounds(60, 410, 117, 29);
		contentPane.add(btnNewButton);
	}
}
