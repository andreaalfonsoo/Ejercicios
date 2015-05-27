import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UnBoton extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnBoton frame = new UnBoton();
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
	public UnBoton() {
		
		//Panel visual
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 200, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor = new JLabel("Valor 1");
		lblValor.setBounds(10, 11, 46, 14);
		contentPane.add(lblValor);
		
		//CAJA1
		caja1 = new JTextField();
		caja1.setBounds(10, 36, 86, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		JLabel lblValor_1 = new JLabel("Valor 2");
		lblValor_1.setBounds(10, 134, 46, 14);
		contentPane.add(lblValor_1);
		
		//CAJA2
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(10, 159, 86, 20);
		contentPane.add(caja2);
		
		//BOTON
		JButton boton = new JButton("Copiar");
		
		//CODIGO BOTON
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textoCaja1 = "";
				textoCaja1 = caja1.getText();
				caja2.setText(textoCaja1);
			}
		});
		boton.setBounds(10, 84, 89, 23);
		contentPane.add(boton);
	}
}
