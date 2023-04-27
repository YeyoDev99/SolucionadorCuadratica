package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import Logica.Cuadratica;
import Logica.SolucionadorCuadratica;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("unused")
public class Pantalla {

	JFrame frame;
	private JTextField txtNumeroA;
	private JTextField txtNumeroB;
	private JTextField txtNumeroC;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Solucionador Cuadratica");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTitulo.setBounds(106, 11, 213, 14);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("digite los valores de la cuadratica de forma Ax^2+Bx+C=0:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 51, 364, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A:");
		lblNewLabel_1.setBounds(10, 79, 20, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("B:");
		lblNewLabel_2.setBounds(10, 104, 20, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("C:");
		lblNewLabel_3.setBounds(10, 129, 20, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNumeroA = new JTextField();
		txtNumeroA.setBounds(36, 76, 86, 20);
		frame.getContentPane().add(txtNumeroA);
		txtNumeroA.setColumns(10);
		
		txtNumeroB = new JTextField();
		txtNumeroB.setBounds(36, 101, 86, 20);
		frame.getContentPane().add(txtNumeroB);
		txtNumeroB.setColumns(10);
		
		txtNumeroC = new JTextField();
		txtNumeroC.setBounds(36, 126, 86, 20);
		frame.getContentPane().add(txtNumeroC);
		txtNumeroC.setColumns(10);
		
		JButton btnSalida = new JButton("Salir");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalida.setBounds(172, 227, 89, 23);
		frame.getContentPane().add(btnSalida);
		
		JLabel lblSolucion = new JLabel("");
		lblSolucion.setBackground(new Color(192, 192, 192));
		lblSolucion.setBounds(25, 182, 375, 34);
		frame.getContentPane().add(lblSolucion);
		
		JButton btnCalcular = new JButton("Resolver");
		btnCalcular.setForeground(new Color(0, 0, 0));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//realiza la multiplicacion de dos números
				double numA;
				double numB;
				double numC;
				try {
					numA = Double.parseDouble(txtNumeroA.getText());
					numB = Double.parseDouble(txtNumeroB.getText());
					numC = Double.parseDouble(txtNumeroC.getText());
					SolucionadorCuadratica solucionador = new SolucionadorCuadratica(numA, numB, numC);
					solucionador.calculadoraCuadratica();
					String resultado = solucionador.getResultado();
					lblSolucion.setText(resultado);
				}
				catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Solo se aceptan números");

				}
			}
		});
		btnCalcular.setBounds(172, 148, 89, 23);
		frame.getContentPane().add(btnCalcular);
	}
}
