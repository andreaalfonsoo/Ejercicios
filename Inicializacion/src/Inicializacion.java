import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Inicializacion extends JFrame {

	//Objetos de la ventana
	private JPanel contentPane;
	private JTextField caja;
	private JLabel lblTexto;
	
	//Variables
	String texto = "";
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//Arranca la ventana
			public void run() {
				try {
					//Creariamos la ventana
					Inicializacion ventana = new Inicializacion();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//Fin
			
		});
	}

	/**
	 * Creamos la ventana
	 */
	public Inicializacion() {
		
		
		//Configuraciones iniciales de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTexto = new JLabel("Texto");
		lblTexto.setBounds(10, 11, 46, 14);
		contentPane.add(lblTexto);
		
		caja = new JTextField();
		caja.setBounds(10, 34, 75, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		//Asignar valor a la caja
		caja.setText(texto);
		
	}

}
