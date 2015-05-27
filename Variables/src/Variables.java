import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Variables extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	JLabel lblEnteros = new JLabel("Enteros");
	private JTextField caja2;
	private JTextField caja3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variables ventana = new Variables();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Variables() {
		//ZONA DE VARIABLES
		//String cadenaTexto = "Andrea";
		int valor = 0;
		int valor2 = 13;
		float decimal = 2.34f;
		float decimal2,decimal3;
		boolean si = true;
		String valorCaja = "Andrea";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//JTextField para mostrar información
		caja = new JTextField();
		caja.setBounds(10, 40, 172, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		//cajaTexto.setText(cadenaTexto);
		
		//Etiqueta
		lblEnteros.setBounds(10, 11, 172, 18);
		contentPane.add(lblEnteros);
		
		//Visualizar variable
		valor = 10;
		valor = valor2;
		//Conversiones
		valorCaja = Integer.toString(valor);
		
		System.out.println(valor);
		
		caja.setText(valorCaja);
		
		JLabel lblDecimales = new JLabel("Decimales");
		lblDecimales.setBounds(10, 71, 172, 18);
		contentPane.add(lblDecimales);
		
		caja2 = new JTextField();
		caja2.setText("13");
		caja2.setColumns(10);
		caja2.setBounds(10, 100, 172, 20);
		contentPane.add(caja2);
		
		//Conversiones
		valorCaja = Float.toString(decimal);
		caja2.setText(valorCaja);
		
		JLabel lblEntero = new JLabel("Boolean");
		lblEntero.setBounds(10, 131, 172, 18);
		contentPane.add(lblEntero);
		
		caja3 = new JTextField();
		caja3.setText("13");
		caja3.setColumns(10);
		caja3.setBounds(10, 160, 172, 20);
		contentPane.add(caja3);
		
		//Conversiones
		valorCaja = Boolean.toString(si);
		caja3.setText(valorCaja);
		
	}
}
